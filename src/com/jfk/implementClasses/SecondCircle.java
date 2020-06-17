package com.jfk.implementClasses;

public class SecondCircle {
    private double radius;

    public SecondCircle() {

    }

    public SecondCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "SecondCircle{" +
                "radius=" + radius +
                '}';
    }
}
