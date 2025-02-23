package com.dmdev.homework6;
/**
 * Создать класс, описывающий банкомат. Банкомат задается тремя свойствами:количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10.
 */
public class ATM {
    private int fiftyCount;
    private int twentyCount;
    private int tenCount;

    public ATM(int fiftyCount, int twentyCount, int tenCount) {
        this.fiftyCount = fiftyCount;
        this.twentyCount = twentyCount;
        this.tenCount = tenCount;
    }

    public int getSumFifties(int fiftyCount) {
        return 50 * fiftyCount;
    }

    public int getSumTwenties(int twentyCount) {
        return 20 * twentyCount;
    }

    public int getSumTens(int tenCount) {
        return 10 * tenCount;
    }

    public int sumInput(){
        return getSumFifties(fiftyCount) + getSumTwenties(twentyCount) + getSumTens(tenCount);
    }

    public void printSumInput(ATM atm) {
        System.out.println("Deposited into the account: " + sumInput());
        System.out.println("50 banknotes: " + fiftyCount);
        System.out.println("20 banknotes: " + twentyCount);
        System.out.println("10 banknotes: " + tenCount);
    }

    public int getStatusPersonalAccount() {
        int personalAccount = 0;
        personalAccount += sumInput();
        return personalAccount;
    }

    public boolean isOperationSuccessful(int cashWithdraw) {
        return getStatusPersonalAccount() - cashWithdraw >= 0;
    }

    public void outPutCash(ATM atm, int cashWithdraw) {
        if (atm.isOperationSuccessful(cashWithdraw)) {
            System.out.println("Cash withdrawal in the amount of: " + cashWithdraw + " is possible" );
            atm.printOutBanknotes(cashWithdraw);
        } else {
            System.out.println("Сash withdrawal is not possible, there is not enough money");
        }
    }

    public void printOutBanknotes(int cashWithdraw) {
        int countOut50 = cashWithdraw / 50;
        fiftyCount -= countOut50;
        System.out.println("50 banknotes: " + countOut50);
        int countOut20 = cashWithdraw % 50 / 20;
        twentyCount -= countOut20;
        System.out.println("20 banknotes: " + countOut20);
        int countOut10 = cashWithdraw % 50 % 20 / 10;
        tenCount -= countOut10;
        System.out.println("10 banknotes: " + countOut10);
    }
}
