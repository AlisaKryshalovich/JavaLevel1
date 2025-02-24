package com.dmdev.homework7;

public class SpaceRunner {
    public static void main(String[] args) {

        Planet earth = new Planet("Earth", 567, 35);
        Star sun = new Star("Sun", 789, 67);
        Satellite future = new Satellite("Future", 45, 15);
        Moon moon = new Moon("Moon", 897, 56);

        System.out.println(earth);
        System.out.println(sun);
        System.out.println(future);
        System.out.println();
        printGravityForce(earth, moon);
        System.out.println();
        printStarCheck(sun);
        printStarCheck(moon);
    }

    public static void printGravityForce(SpaceObject obj1, SpaceObject obj2) {
        double forceEarthMoon = SpaceUtils.calculateGravity(obj1, obj2, SpaceUtils.distanceEarthMoon);
        System.out.println("Gravitational force between the Earth and the Moon: " + forceEarthMoon);
    }

    public static void printStarCheck(SpaceObject obj) {
        boolean isSunStar = SpaceUtils.isStar(obj);
        System.out.println("Is object a Star? " + isSunStar);



    }

}
