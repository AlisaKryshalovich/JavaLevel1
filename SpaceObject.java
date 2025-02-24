package com.dmdev.homework7;

public abstract class SpaceObject implements WithDiameter {

    private String name;
    private double mass;

    public SpaceObject(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public abstract double calculateDiameter();

    public boolean compareMass(SpaceObject other) {
        return this.mass > other.mass;
    }
    @Override
    public abstract String toString();

    public double getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }
}
