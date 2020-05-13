package com.jfk.homework03;

public class Task_71 {
    public static void main(String[] args) {
        for (double x = 2.4; x <= 7.6; x += 0.2) {
            double y = Math.tan(2 * x + x * x);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
