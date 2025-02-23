package com.dmdev.homework6;

import java.util.Scanner;

public class ATM_Runner {
    public static void main(String[] args) {

        ATM atm = new ATM(7, 6, 1);
        inputCash(atm);
        System.out.println();
        outputCash(atm, 430);
    }

    public static void inputCash(ATM atm2) {
        atm2.printSumInput(atm2);
    }

    public static void outputCash(ATM atm2, int cashWithdraw) {
    atm2.outPutCash(atm2,cashWithdraw);
    }
}
