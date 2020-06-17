package com.jfk.implementClasses;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);
        System.out.println("The area of rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of rectangle is: " + rectangle.getPerimeter());
    }
}
