package com.jfk.Lesson13_Object.Shapes;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle");
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }
}
