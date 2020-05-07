package com.jfk.secondHomework;

public class Task_57 {
    public static void main(String[] args) {
        int number = 137;

        double f = number / 100;
        double m = (number % 100) / 10;
        double l = number % 10;

        if (number > 300) {
            System.out.println(m / l);
        } else {
            System.out.println(f / l);
        }
    }
}
