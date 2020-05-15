package com.jfk.homework04;

public class Task_83 {
    public static void main(String[] args) {
        for(double x = -4.8; x <= 5.2; x += 0.2){
            double y = Math.pow(Math.atan(x + 1), 2);
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
