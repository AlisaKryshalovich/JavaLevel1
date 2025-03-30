package com.dmdev.hw13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class SupportService {
    private final Path inputFile;
    private final Path outputFile;
    private final BlockingQueue<Complaint> complaintQueue;
    private final ExecutorService dispatcherPool;
    private boolean hasMoreComplaints = true;


    public SupportService(Path inputFile, Path outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.complaintQueue = new LinkedBlockingQueue<>();
        this.dispatcherPool = Executors.newFixedThreadPool(2);
    }

    public void start() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Планировщик: считывание новых жалоб каждые 10 секунд
        scheduler.scheduleAtFixedRate(() -> {
            if (hasMoreComplaints) {
                readComplaintsFromLog();
            }
        }, 0, 5, TimeUnit.SECONDS);

        // Запуск диспетчеров для обработки жалоб
        for (int i = 0; i < 2; i++) {
            dispatcherPool.submit(() -> processComplaints(scheduler));
        }
    }

    private void readComplaintsFromLog() {
        try (BufferedReader reader = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                if (parts.length < 5) continue;

                int id = Integer.parseInt(parts[0].trim());
                LocalDateTime dateTime = LocalDateTime.parse(parts[1].trim(), DateTimeFormatter.ISO_DATE_TIME);
                String clientName = parts[2].trim();
                String phone = PhoneFormatterUtil.formatPhoneNumber(parts[3].trim());
                String complaintText = parts[4].trim();

                Complaint complaint = new Complaint(id, dateTime, clientName, phone, complaintText);
                complaintQueue.offer(complaint);
            }
            hasMoreComplaints = false;
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private void processComplaints(ScheduledExecutorService scheduler) {
        CallHandler dispatcher = new CallHandler(outputFile);

        while (true) {
            try {
                Complaint complaint = complaintQueue.poll(5, TimeUnit.SECONDS);
                if (complaint == null && !hasMoreComplaints) {
                    shutdownServices(scheduler);
                    break;
                }
                if (complaint != null) {
                    dispatcher.handleComplaint(complaint);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private synchronized void shutdownServices(ScheduledExecutorService scheduler) {
        dispatcherPool.shutdown();
        scheduler.shutdown();
        System.out.println("Все жалобы обработаны.");
    }
}
