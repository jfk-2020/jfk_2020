package com.jfk.implementClasses;

public class Circle {

    //Fields of the circle
    private double radius;
    private String color;

    //Creating constructor
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

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius='" + radius + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

