package com.jfk.homework04;

public class Task_86 {
    public static void main(String[] args) {
        for (int x = -5; x <= 8; x += 2) {
            double y = 0;
            if (x > 2) {
                y = Math.pow(3, x + 4);
            } else {
                y = -8;
            }
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
