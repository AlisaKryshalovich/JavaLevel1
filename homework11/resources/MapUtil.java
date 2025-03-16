package com.dmdev.homework11.resources;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;

public final class MapUtil {
    private MapUtil() {
    }

    public static Map<String, String> getPriceMap(Path pricePath) throws IOException {
        try (Stream<String> lines = Files.lines(pricePath)) {
            return lines.skip(1)
                    .map(stringLine -> stringLine.split(","))
                    .filter(strings -> strings.length > 1)
                    .collect(toMap(strings -> strings[0], strings -> strings[1]));
        }
    }

    public static Map<String, String> getNameMap(Path namePath) throws IOException {
        try(Stream<String> lines = Files.lines(namePath)) {
            return lines.skip(1)
                    .map(stringLine -> stringLine.split(","))
                    .filter(strings -> strings.length > 1)
                    .collect(toMap(strings -> strings[0], strings -> strings[1]));
        }
    }
}
