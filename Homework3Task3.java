package Dmdev.CS.Homework3;
import java.util.Arrays;
/**
 * Дан одномерный массив целых чисел. Написать функцию, которая принимает этот массив
 * и разбивает на 3 других: с только отрицательными числами, только положительными и
 * только нули. Если для какого-то из массивов не будет значений, то должен быть
 * создан пустой массив. Возвращает функция эти три массива в виде одного двумерного.
 * Пример: {-4, 0, 1, 9, 0, -18, 3} -> {{-4, -18}, {0, 0}, {1, 9, 3}}
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values = {6, -22, 0, 18, -34, 26, 54};
        int[][] resultArray = get2DArray(values);
        for (int[] array : resultArray) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static int[][] get2DArray(int[] values) {
        int[][] array2D = new int[3][];
        int[] arrayNegative = new int[calculateSizeNegative(values)];
        int[] arrayZero = new int[calculateSizeZero(values)];
        int[] arrayPositive = new int[calculateSizePositive(values)];
        array2D[0] = arrayNegative;
        array2D[1] = arrayZero;
        array2D[2] = arrayPositive;

        for (int i = 0, indexNegative = 0, indexZero = 0, indexPositive = 0; i < values.length; i++) {
            if (values[i] < 0) {
                array2D[0][indexNegative] = values[i];
                indexNegative++;
            } else if (values[i] == 0) {
                array2D[1][indexZero] = values[i];
                indexZero++;
            } else {
                array2D[2][indexPositive] = values[i];
                indexPositive++;
            }
        }
        return array2D;
    }

    private static int calculateSizeNegative(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value < 0) {
                size++;
            }
        }
        return size;
    }

    private static int calculateSizePositive(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value > 0) {
                size++;
            }
        }
        return size;
    }

    private static int calculateSizeZero(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value == 0) {
                size++;
            }
        }
        return size;
    }
}
