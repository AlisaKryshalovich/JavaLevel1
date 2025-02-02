package Dmdev.CS.Homework1;
/**
 * Даны 3 переменные: operand1(double), operand2(double), operation(char '+','-','*','/','%')
 * написать функцию, которая принимает а качестве параметров эти три переменные и возвращает результат операции
 * например: Параметры: operand1 = 24.4, operand2 = 10.1, operation = '+'
 * результат: 34.5 (24.4 + 10.1)
 */
public class Homework1Task2 {
    public static void main(String[] args) {
        double operand1 = -150;
        double operand2 = 146.5;
        char operation = '/';

        outputResult(operand1, operand2, operation);
    }

    public static void outputResult(double operand1, double operand2, char operation){
        if (operation == '+') {
            double sum = operand1 + operand2;
            System.out.println(sum + " (" + operand1 + " + " + operand2 + ")");
        } else if (operation == '-') {
            double subtraction = operand1 - operand2;
            System.out.println(subtraction + " (" + operand1 + " - " + operand2 + ")");
        } else if (operation == '*'){
            if (operand1 != 0 && operand2 != 0){
                double multiply = operand1 * operand2;
                System.out.println(multiply + " (" + operand1 + " * " + operand2 + ")");
            } else {
                System.out.println("Value is not correct");
            }
        } else if (operation == '/') {
            if (operand1 != 0 && operand2 != 0){
                double division = operand1 / operand2;
                System.out.println(division + " (" + operand1 + " / " + operand2 + ")");
            } else {
                System.out.println("Value is not correct");
            }
        } else if (operation == '%') {
            if (operand1 != 0 && operand2 != 0) {
                double divisionModule = operand1 % operand2;
                System.out.println(divisionModule + " (" + operand1 + " % " + operand2 + ")");
            } else {
                System.out.println("Value is not correct");
            }
        } else {
            System.out.println("Value of operation is not correct");
        }
    }
}
