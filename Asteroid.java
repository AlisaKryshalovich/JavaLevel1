package com.dmdev.homework7;

public class Asteroid extends Planet {

    public Asteroid(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public String toString() {
        return "Asteroid " + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter();
    }

}
