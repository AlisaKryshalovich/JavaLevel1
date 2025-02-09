package Dmdev.CS.Homework2;
/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает
 * целое число обратное этому (не строку!)
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74
 * Примечание: для решения может понадобиться функция возведения числа в
 * степень: Math.pow(число, степень)
 */
public class Homework2Task2 {
    public static void main(String[] args) {
        int value = 95632;

        System.out.println(getTurnOverValue(value));
    }

    private static int checkValid(int value) {
        return value > 0 ? value : value * -1;
    }

    private static int getTurnOverValue(int value) {
        int invertedNumber = 0;
        for (int currentValue = checkValid(value); currentValue > 0; currentValue /= 10) {
            invertedNumber = invertedNumber * 10 + currentValue % 10;
        }
        return invertedNumber;
    }
}
