package com.dmdev.oop.homework5;
import java.util.Arrays;
/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * 1. Возвращающий массив цифр из переданной строки
 * 2. Возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например: “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Homework5Task2 {
    public static void main(String[] args) {
        String value = "Сейчас идет 3 месяц зимы и температура до -10, но скоро будет весна и станет +15";

        int[] intArray = getIntArray(value);
        System.out.println(Arrays.toString(intArray));

        int sumValuesIntArray = getSumValuesIntArray(intArray);
        System.out.println("Sum of array values: " + sumValuesIntArray);
    }

    private static int[] getIntArray(String value) {
        char[] chars = value.replaceAll("\\D+", "").toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = Character.getNumericValue(chars[i]);
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
}