package com.jfk.homework04;

public class Task_90 {
    public static void main(String[] args) {
        for (double x = -30; x <= 30; x += 3.5) {
            double y = 0;
            if (x > 5) {
                y = Math.sin(x);
            } else {
                y = Math.cos(x);
            }
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
