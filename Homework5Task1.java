package com.dmdev.oop.homework5;
/**
 * Дана строка. Удалить из нее все повторяющиеся символы без учета регистра,
 * если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например: "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Homework5Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = getValueWithoutDuplicates(value);
        System.out.println(result);
    }

    private static String getValueWithoutDuplicates(String value) {
        StringBuilder sb = new StringBuilder();
        char[] chars = value.replace(SPACE,EMPTY).toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i] != chars[i - 1]) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
