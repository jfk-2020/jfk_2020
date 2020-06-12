package com.jfk.constructor;

public class Circle {

    //Fields of the circle
    private int radius;

    //Creating constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    //Creating function to count the area of a circle
    public double area() {
        return Math.PI * (Math.pow(radius, 2));
    }

    //Creating function to count the perimeter of a circle
    public double perimeter() {
        return 2 * (Math.PI * radius);
    }
}
