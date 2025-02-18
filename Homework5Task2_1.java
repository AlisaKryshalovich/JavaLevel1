package com.dmdev.oop.homework5;

import java.util.Arrays;

public class Homework5Task2_1 {
    private static final String ZERO = "0";
    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String THREE = "3";
    private static final String FOUR = "4";
    private static final String FIVE = "5";
    private static final String SIX = "6";
    private static final String SEVEN = "7";
    private static final String EIGHT = "8";
    private static final String NINE = "9";
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        printAllInformation();
    }

    private static void printAllInformation() {
        String value = "Сейчас идет 3 месяц зимы и температура до -10, но скоро будет весна и станет +15";
        int sumValuesIntArray = getSumValuesIntArray(getIntArray(getCharArrayDigit(value)));
        System.out.println("Sum of array values: " + sumValuesIntArray);

        int[] intArray = getIntArray(getCharArrayDigit(value));
        System.out.println(Arrays.toString(intArray));
    }

    private static char[] getCharArrayDigit(String value) {
        String withoutSpace = value.replace(SPACE, EMPTY);
        String withoutDigits = withoutSpace.replace(ZERO, EMPTY)
                .replace(ONE, EMPTY)
                .replace(TWO, EMPTY)
                .replace(THREE, EMPTY)
                .replace(FOUR, EMPTY)
                .replace(FIVE, EMPTY)
                .replace(SIX, EMPTY)
                .replace(SEVEN, EMPTY)
                .replace(EIGHT, EMPTY)
                .replace(NINE, EMPTY);
        int lengthDigits = withoutSpace.length() - withoutDigits.length();
        char[] chars = withoutSpace.toCharArray();
        char[] charArrayDigits = new char[lengthDigits];
        for (int i = 0, index = 0; i < chars.length; i++) {
            if (chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9' || chars[i] == '0') {
                charArrayDigits[index] = chars[i];
                index++;
            }
        }
        return charArrayDigits;
    }

    private static int[] getIntArray(char[] charArrayDigits) {
        int[] result = new int[charArrayDigits.length];
        for (int i = 0; i < result.length; ) {
            for (char c : charArrayDigits) {
                int intValue = c;
                result[i++] = getIntDigit(intValue);
            }
        }
        return result;
    }

    private static int getSumValuesIntArray(int[] result) {
        int sum = 0;
        for (int value : result) {
            sum += value;
        }
        return sum;
    }

    private static int getIntDigit(int value) {
        return switch (value) {
            case 49 -> 1;
            case 50 -> 2;
            case 51 -> 3;
            case 52 -> 4;
            case 53 -> 5;
            case 54 -> 6;
            case 55 -> 7;
            case 56 -> 8;
            case 57 -> 9;
            default -> 0;
        };
    }
}
