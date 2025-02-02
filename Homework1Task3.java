package Dmdev.CS.Homework1;

/**
 * Даны два прямоугольных треугольника. Каждый из них задается двумя
 * целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника
 * и затем эти площади сравниваются друг с другом.
 * Написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль
 * первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Homework1Task3 {
    public static void main(String[] args) {
        double a1 = 10;
        double b1 = 7.0;
        double a2 = 10;
        double b2 = 7.0;

        double area1 = calculateArea(a1, b1);
        double area2 = calculateArea(a2, b2);

        compareArea(area1, area2);

    }

    public static double calculateArea(double a, double b) {
        return (a * b) / 2;
    }

    public static void compareArea(double area1, double area2) {
        if (area1 <= 0 || area2 <= 0 ){
            System.out.println("Value is not correct");
        } else if (area1 > area2) {
            System.out.println("The first triangle is larger than the second");
        } else if (area1 == area2) {
            System.out.println("Triangles are equal");
        } else {
            System.out.println("The first triangle is smaller than the second");
        }
    }
}