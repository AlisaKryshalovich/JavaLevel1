package com.dmdev.homework7;

public class DwarfPlanet extends Planet implements WithRotate {

    public DwarfPlanet(String name, double mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public void rotate() {
        System.out.println("Dwarf planet is rotating");
    }

    @Override
    public String toString() {
        return "Dwarf Planet" + getName() + ": mass = " + getMass() + ", diameter = " + calculateDiameter();
    }
}
