package Dmdev.CS.Homework3;
import java.util.Arrays;
/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив c только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {6, -12, 34, 9, -67, 0, 9, 12, -7};
        int[] resultArray = getNewArray(values);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] getNewArray(int[] values) {
        int[] result = new int[calculateNewArraySize(values)];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                values[i] *= 2;
                result[index++] = values[i];
            }
        }
        return result;
    }

    private static int calculateNewArraySize(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value > 0) {
                size++;
            }
        }
        return size;
    }
}

