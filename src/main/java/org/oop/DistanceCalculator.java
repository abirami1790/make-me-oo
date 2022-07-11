package org.oop;

public class DistanceCalculator implements Calculator{
    @Override
    public double calculate(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
