package com.jfk.constructor;

public class Triangle {

    //Fields of the triangle
    private int a;
    private int b;
    private int c;
    private int height;

    //Creating constructor
    public Triangle(int a, int b, int c, int height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    //Creating function to count the area of the triangle
    public int area() {
        return a * height / 2;
    }

    public int sum() {
        return a + b + c;
    }
}
