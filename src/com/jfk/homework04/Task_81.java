package com.jfk.homework04;

public class Task_81 {
    public static void main(String[] args) {
        for (double x = -7.5; x <= 8.3; x += 0.3) {
            double y = Math.log((x * x) + 4) / Math.log(3);
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
