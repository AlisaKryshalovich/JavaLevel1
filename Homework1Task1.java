package Dmdev.CS.Homework1;
/**
* в переменно minutes лежит число от 0 до 59.
 * написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (первую, вторую, третью, четвертую)
 */
public class Homework1Task1 {
    public static void main(String[] args) {
        int minutes = 36;
        outputQuarter(minutes);
    }
    public static void outputQuarter(int minutes){
        if (0 <= minutes && minutes<= 15){
            System.out.println(minutes + " входит в первую четверть часа");
        } else if (16 <= minutes && minutes <= 30){
            System.out.println(minutes + " входит во вторую четверть часа");
        } else if (31 <= minutes && minutes <= 45){
            System.out.println(minutes + " входит в третью четверть часа");
        } else if (46 <= minutes && minutes <= 59){
            System.out.println(minutes + " входит в четвертую четверть часа");
        } else {
            System.out.println("Значение за пределами диапазона");
        }
    }
}
