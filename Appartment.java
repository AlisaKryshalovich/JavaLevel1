package com.dmdev.oop.homework4;

public class Appartment {

    private int number;
    public Room[] rooms;

    public Appartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;

    }

    public void print() {
        System.out.println("Квартира: " + number + ", количество комнат: " + rooms.length);
        for (Room room : rooms) {
            room.print();
        }
    }
}

