package com.jfk.homework04;

public class Task_82 {
    public static void main(String[] args) {
        for (double x = -2.7; x <= 3.3; x += 0.5) {
            double y = Math.pow((x + (x * x)), 7);
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
