package com.jfk.homework04;

public class Task_88 {
    public static void main(String[] args) {
        for (double x = -3; x <= 3; x += 0.8) {
            double y = 0;
            if (x > 1) {
                y = 6 * Math.pow(Math.E, 8 + x);
            } else {
                y = x + 4;
            }
            System.out.println(" x = " + x + "y = " + y);
        }
    }
}
