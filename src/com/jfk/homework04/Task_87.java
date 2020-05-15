package com.jfk.homework04;

public class Task_87 {
    public static void main(String[] args) {
        for (double x = 10; x <= 23; x += 3.2) {
            double y = 0;
            if (x > 7) {
                y = Math.pow(Math.E, Math.sin(x));
            } else {
                y = 0;
            }
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
