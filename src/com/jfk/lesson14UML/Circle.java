package com.jfk.lesson14UML;

public class Circle {
    private double radius = 1.0;
    private String color;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("Circle [radius=%f, color=%s]", radius, color);
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
