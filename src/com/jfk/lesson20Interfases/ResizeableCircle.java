package com.jfk.lesson20Interfases;

public class ResizeableCircle extends Circle implements Resizable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius + radius*percent/100;
    }
}
