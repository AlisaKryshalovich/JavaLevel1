package com.dmdev.hw13;

import java.nio.file.Path;

public class SupportServiceEmulator {
    public static void main(String[] args) {
        Path input = Path.of("resources", "reader.txt");
        Path output = Path.of("resources", "writer.txt");
        SupportService supportService = new SupportService(input, output);
        supportService.start();
    }
}
