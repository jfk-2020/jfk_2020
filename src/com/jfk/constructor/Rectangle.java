package com.jfk.constructor;

public class Rectangle {

    //Fields of the rectangle
    private int width;
    private int height;

    //Creating constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Creating function to count the perimeter
    public  int perimeter() {
        return (width + height) * 2;
    }
}
