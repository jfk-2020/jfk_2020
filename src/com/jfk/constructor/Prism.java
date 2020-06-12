package com.jfk.constructor;

public class Prism {

    //Fields of the prism
    private int length;
    private int width;
    private int height;

    //Creating constructor
    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Creating function to find the volume
    public int volume() {
        return length * width * height;
    }
}
