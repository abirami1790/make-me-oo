package org.oop;

public class Point {
    private double x;
    private double y;

    double xDistance(Point point){
        return point.x - this.x;
    }

    double yDistance(Point point){
        return point.y - this.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
