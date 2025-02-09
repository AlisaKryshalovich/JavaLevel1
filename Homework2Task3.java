package Dmdev.CS.Homework2;
/**
 * Программист Ваня сразу после окончания курсов Dmdev устроился в IT компанию
 * на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали что будут поднимать зарплату на 400$ каждые 6 месяцев
 * 300$ в месяц Ваня тратит на еду и развлечения
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера,
 * чтобы инвестировать в акции с доходностью 2% в месяц
 * Посчитать, сколько Ваня будет иметь средств на своем счету и
 * на счету брокера за 3 года и 2 месяца
 * Для интереса: попробовать увеличить процент, который Ваня инвестирует из своей зарплаты
 */
public class Homework2Task3 {
    public static void main(String[] args) {
        double initialSalary = 600;
        double raiseAmount = 400;
        double monthlyExpenses = 300;
        double investmentAnte = 0.1;
        double investmentReturn = 0.02;
        int monthRaise = 6;
        int totalMonths = 38; // 3 years and 2 months

        double personalAccount = getPersonalAccount(initialSalary, totalMonths, monthlyExpenses, investmentAnte, raiseAmount,monthRaise);
        System.out.println("Status personal account after 3 years and 2 months: " + personalAccount);

        double brokerAccount = getBrokerAccount(initialSalary,totalMonths,investmentAnte,raiseAmount,investmentReturn,monthRaise);
        System.out.println("Status broker account after 3 years and 2 months: " + brokerAccount);
    }

    private static double getPersonalAccount(double initialSalary, int totalMonths, double monthlyExpenses, double investmentAnte, double raiseAmount, int monthRaise) {
        double result = 0;
        double currentSalary = initialSalary;
        for (int month = 2; month <= totalMonths; month++) {
            result = result + currentSalary - monthlyExpenses - (currentSalary * investmentAnte);
            if (month % monthRaise == 0) {
                currentSalary += raiseAmount;
            }
        }
        return result;
    }

    private static double getBrokerAccount(double initialSalary, int totalMonths, double investmentAnte, double raiseAmount, double investmentReturn, int monthRaise) {
        double result = 0;
        double currentSalary = initialSalary;
        for (int month = 2; month <= totalMonths; month++) {
            double investment = currentSalary * investmentAnte;
            result = result + (result * investmentReturn) + investment;
            if (month % monthRaise == 0) {
                currentSalary += raiseAmount;
            }
        }
        return result;
    }
}
