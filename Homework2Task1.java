package Dmdev.CS.Homework2;
/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать две функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено 228910, то у него 4 четные цифры (2,2,8,0) и 2 нечетные (9,1)
 */
public class Homework2Task1 {
    public static void main(String[] args) {
        int value = 567980;
        System.out.println("Number of even: " + getNumberEven(value));
        System.out.println("Number of odd: " + getNumberOdd(value));
    }

    private static int checkValid(int value){
    return value > 0 ? value : value * -1;
    }

    private static int getNumberEven(int value){
        int sum = 0;
        for (int currentValue = checkValid(value); currentValue > 0 ; currentValue /= 10) {
            int number = currentValue % 10;
            if (number % 2 == 0){
                sum += 1;
            }
        }
        return sum;
    }

    private static int getNumberOdd(int value){
        int sum = 0;
        for (int currentValue = checkValid(value); currentValue > 0; currentValue /= 10) {
            int number = currentValue % 10;
            if (number % 2 != 0){
                sum += 1;
            }
        }
        return sum;
    }
}
