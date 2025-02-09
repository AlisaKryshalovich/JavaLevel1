package Dmdev.CS.Homework3;
import java.util.Arrays;
/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код
 * символа (любой символ - это число в памяти компьютера).
 * Далее определить среднее арифметическое всех элементов целочисленного
 * массива и вывести на консоль только те элементы, которые больше
 * этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        //              118   47    59  126  98
        char[] values = {'v', '/', ';', '~', 'b'};

        int[] resultArray = getNewArray(values);
        System.out.println(Arrays.toString(resultArray));

        double arithmeticAverage = calculateArithmeticAverage(resultArray);
        System.out.println("Arithmetic Average: " + arithmeticAverage);

        printValuesGreaterAverage(resultArray);
    }

    private static void printValuesGreaterAverage(int[] resultArray) {
        for (int value : resultArray) {
            if (calculateArithmeticAverage(resultArray) < value) {
                System.out.print(value + " ");
            }
        }
    }

    private static double calculateArithmeticAverage(int[] resultArray) {
        double sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            sum += resultArray[i];
        }
        return sum / resultArray.length;
    }

    private static int[] getNewArray(char[] values) {
        int[] result = new int[values.length];
            for (int i = 0; i < result.length; ) {
                for (char value : values) {
                result[i++] = value;
            }
        }
        return result;
    }
}
