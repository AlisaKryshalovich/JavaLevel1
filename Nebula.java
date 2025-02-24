package com.dmdev.homework7;

public class Nebula extends SpaceObject {

    public Nebula(String name, double mass) {
        super(name, mass);
    }

    @Override
    public double calculateDiameter() {
        return getMass() * 100;
    }

    @Override
    public String toString() {
        return "Nebula: mass = " + getMass() + ", diameter = " + calculateDiameter();
    }


}
