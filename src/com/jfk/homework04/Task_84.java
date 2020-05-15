package com.jfk.homework04;

public class Task_84 {
    public static void main(String[] args) {
        for (double x = -6.4; x <= 2.4; x += 0.2) {
            double y = Math.pow(Math.E, 1/Math.tan(x));
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
