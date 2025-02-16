package com.dmdev.oop.homework4;

public class HouseRunner {
    public static void main(String[] args) {

        Room[] rooms1 = {new Room(true), new Room(false)};
        Room[] rooms2 = {new Room(true), new Room(false), new Room(false)};
        Room[] rooms3 = {new Room(false), new Room(false), new Room(false)};

        Appartment[] appartments1 = {new Appartment(5, rooms1), new Appartment(6, rooms2)};
        Appartment[] appartments2 = {new Appartment(7, rooms1), new Appartment(8, rooms3)};

        Floor[] floors1 = {new Floor(2, appartments1), new Floor(3, appartments2)};

        House house = new House(25, floors1);

        printAllInformation(house);
    }
    public static void printAllInformation(House house) {
        house.print();
    }
}
