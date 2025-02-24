package com.dmdev.homework7;

public class Satellite extends Planet {

    public Satellite(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public String toString() {
        return "Satellite " + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter();
    }
}

