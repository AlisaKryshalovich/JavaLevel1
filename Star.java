package com.dmdev.homework7;

public class Star extends SpaceObject {

    private double luminosity;

    public Star(String name, double mass, double luminosity) {
        super(name, mass);
        this.luminosity = luminosity;
    }

    @Override
    public double calculateDiameter() {
        return Math.pow(getLuminosity(), 0.5) * 10;
    }

    @Override
    public String toString() {
        return "Star " + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter() + ", luminosity = " + getLuminosity();
    }

    public double getLuminosity() {
        return luminosity;
    }
}
