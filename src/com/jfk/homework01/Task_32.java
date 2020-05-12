package com.jfk.homework01;

public class Task_32 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 5;
        int d = 3;

        int min = 0;

        if (a < b) {
            if (a < c) {
                if (a < d) {
                    min = a;
                } else {
                    min = d;
                }
            } else {
                min = c;
                if (d < c) {
                    min = d;
                } else {
                    min = c;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    min = b;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        }
        System.out.println("The min number is: " + min);
    }
}
