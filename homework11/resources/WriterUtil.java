package com.dmdev.homework11.resources;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class WriterUtil {
    private WriterUtil(){}

    public static void writeFiles(Map<String, String> priceMap, Map<String, String> nameMap, Path mergeFile, Path errorFile) throws IOException {
        List<String> mergeList = new ArrayList<>();
        List<String> errorList = new ArrayList<>();
        mergeList.add("ID,NAME,PRICE");
        errorList.add("ID");

        Set<String> allKeys = new HashSet<>(priceMap.keySet());
        allKeys.addAll(nameMap.keySet());
        for (String id : allKeys) {
            String name = nameMap.get(id);
            String price = priceMap.get(id);
            if (name != null && price != null) {
                mergeList.add(id + "," + name + "," + price);
            } else {
                errorList.add(id + " ");
            }
        }
        writeToFile(mergeFile,mergeList);
        writeToFile(errorFile,errorList);
    }

    public static void writeToFile(Path filePath, List<String> list) throws IOException {
        try(BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (String line : list) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
