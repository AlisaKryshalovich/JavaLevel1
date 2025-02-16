package com.dmdev.oop.homework4;

public class Floor {

    private int number;
    public Appartment[] appartments;

    public Floor(int number, Appartment[] appartments) {
        this.number = number;
        this.appartments = appartments;
    }

    public void print() {
        System.out.println("Этаж: " + number + ", количество квартир: " + appartments.length);
        for (Appartment appartment : appartments) {
            appartment.print();
        }
    }
}
