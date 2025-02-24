package com.dmdev.homework7;

public final class SpaceUtils {
    static final double distanceEarthMoon = 384400;

    public static double calculateGravity(SpaceObject obj1, SpaceObject obj2, double distance) {
        return (obj1.getMass() * obj2.getMass()) / (distance * distance);
    }

    public static boolean isStar(SpaceObject obj) {
        return obj instanceof Star;
    }
}
