package com.jfk.homework03;

public class Task_72 {
    public static void main(String[] args) {
        for (double x = -54; x <= 1.2; x += 0.4) {
            double y = Math.pow(Math.atan(x * x), 2);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
