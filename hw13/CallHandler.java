package com.dmdev.hw13;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CallHandler {

    private final Path outputFile;

    public CallHandler(Path outputFile) {
        this.outputFile = outputFile;
    }

    public void handleComplaint(Complaint complaint) {
        try {
            Thread.sleep(5000);
            String callLogEntry = String.format("%d, %s, %s%n",
                    complaint.getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
                    complaint.getPhoneNumber());

            writeToLog(callLogEntry);
            System.out.println("Созвон завершен c клиентом: " + complaint.getId() + " " + complaint.getFullName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private synchronized void writeToLog(String content) {
        try (BufferedWriter writer = Files.newBufferedWriter((outputFile),
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Oшибка при записи в лог-файл: " + e.getMessage());
        }
    }
}
