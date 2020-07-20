package com.jfk.lesson13Object.Shapes;

public class Circle implements Shape {
    private double side;

    public Circle(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("this is circle");
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * side * side;
    }
}
