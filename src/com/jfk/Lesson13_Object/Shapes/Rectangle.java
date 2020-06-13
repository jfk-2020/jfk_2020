package com.jfk.Lesson13_Object.Shapes;

public class Rectangle implements Shape {
    private double sideA;
    private double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public void draw() {
        System.out.println("This is rectangle");
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
