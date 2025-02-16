package com.dmdev.oop.homework4;

public class Room {

    private boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public void print() {
        System.out.println("Комната проходная: " + isPassage);
    }
}
