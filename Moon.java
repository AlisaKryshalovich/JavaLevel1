package com.dmdev.homework7;

public class Moon extends Planet {

    public Moon(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public String toString() {
        return "Moon: mass = " + getMass() + ", diameter = " + calculateDiameter();
    }

}
