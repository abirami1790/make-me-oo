package org.oop;

public class DirectionCalculator implements Calculator{
    @Override
    public double calculate(Point from, Point to) {
        double xDistance = to.xDistance(from);
        double yDistance = to.yDistance(from);
        return Math.atan2(yDistance, xDistance);
    }

    private double getDistance(double to, double from) {
        double xDistance = to.xDistance(from);
        double yDistance = to.yDistance(from);
        return Math.atan2(yDistance, xDistance);
    }
}
