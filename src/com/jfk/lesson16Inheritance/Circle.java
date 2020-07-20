package com.jfk.lesson16Inheritance;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return String.format("Circle[radius=%f, color=%s]", radius, getColor());
    }
}
