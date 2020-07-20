package com.jfk.lesson13Object.Shapes;

public class Prism implements Shape{
    private double sideA;
    private double sideB;
    private double high;
    public Prism(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public void draw() {
        System.out.println("This is prism");
    }

    @Override
    public double getArea() {
        System.out.println("Oops");
        return 0;
    }
}
