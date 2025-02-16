package com.dmdev.oop.homework4;

public class House {

    private int number;
    public Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Номер дома: " + number + ", количество этажей: " + floors.length);
        for (Floor floor : floors) { // ВЫВЕСТИ ДАННЫЕ ОБО ВСЕХ ОБЬЕКТАХ ТИПА FLOOR
            floor.print();
        }
    }
}
