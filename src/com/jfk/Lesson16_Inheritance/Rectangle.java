package com.jfk.Lesson16_Inheritance;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimetr() {
        return 2*length + 2*width;
    }
    @Override
    public String toString() {
        return String.format("Rectangle[color=%s, filled=%b, length=%f, widht=%f]", getColor(), isFilled(), length, width);
    }
}
