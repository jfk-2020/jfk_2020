package com.jfk.homework04;

public class Task_89 {
    public static void main(String[] args) {
        for (double x = -5; x <= 9; x += 1.5) {
            double y = 0;
            if (x > 3) {
                y = Math.log(x) / Math.log(4);
            } else {
                y = -9;
            }
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
