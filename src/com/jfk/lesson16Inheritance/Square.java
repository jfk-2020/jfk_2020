package com.jfk.lesson16Inheritance;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getLength();
    }
    public void setSide(double side) {
        setLength(side);;
        setWidth(side);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
        setWidth(length);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        setLength(width);
    }
    @Override
    public String toString(){
        return String.format("Square[color=%s, filled=%b, side=%f]", getColor(), isFilled(), getSide());
    }
}
