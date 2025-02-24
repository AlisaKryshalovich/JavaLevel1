package com.dmdev.homework7;

public class Planet extends SpaceObject {

    private double radius;

    public Planet(String name, double mass, double radius) {
        super(name, mass);
        this.radius = radius;
    }

    @Override
    public double calculateDiameter() {
        return 2 * getRadius();
    }

    @Override
    public String toString() {
        return "Planet " + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter();
    }

    public double getRadius() {
        return radius;
    }
}
