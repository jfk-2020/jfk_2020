package com.jfk.Lesson14_UML;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        length = (float)1.0;
        width = (float)1.0;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimetr(){
        return 2*length + 2*width;
    }
    @Override
    public String toString(){
        return String.format("Rectangle[length=%f, width=%f]", length, width);
    }
}
