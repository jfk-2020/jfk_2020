package com.jfk.homework04;

public class Task_85 {
    public static void main(String[] args) {
        for (double x = -3.3; x <= 2.7; x += 0.3) {
            double y = Math.abs((2 * x) + Math.pow(x,3));
            System.out.println("x = " + x + "y = " + y);
        }
    }
}
