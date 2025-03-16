package com.dmdev.homework11.resources;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class WriterRunner {
    public static void main(String[] args) {

        Path priceFile = Path.of("resources", "items-price.csv");
        Path nameFile = Path.of("resources", "items-name.csv");

        Path mergeFile = Path.of("resources", "result.csv");
        Path errorFile = Path.of("resources", "errors.csv");

        try {
            Map<String, String> priceMap = MapUtil.getPriceMap(priceFile);
            Map<String, String> nameMap = MapUtil.getNameMap(nameFile);
            WriterUtil.writeFiles(priceMap, nameMap, mergeFile, errorFile);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}