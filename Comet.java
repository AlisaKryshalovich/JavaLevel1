package com.dmdev.homework7;

public class Comet extends Planet {

    public Comet(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public String toString() {
        return "Comet " + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter();
    }
}
