package com.jfk.Homework01;

public class Task_25 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;

        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("y=1");
                } else {
                    System.out.println("y=2");
                }
            } else {
                System.out.println("y=2");
            }
        } else {
            System.out.println("y=2");
        }
    }
}