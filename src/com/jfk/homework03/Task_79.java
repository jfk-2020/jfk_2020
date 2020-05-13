package com.jfk.homework03;

public class Task_79 {
    public static void main(String[] args) {
        for (int x = -4; x <= 5; x += 1) {
            double y = -9;
            if (x > 1) {
                y = Math.log(x) / Math.log(4);
                System.out.println("x = " + x + "y = " + y);
            }
        }
    }
}
