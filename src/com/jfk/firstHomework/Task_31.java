package com.jfk.firstHomework;

public class Task_31 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;
        int d = 50;

        int max = 0;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                max = c;
                if (d > c) {
                    max = d;
                } else {
                    max = c;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }
        System.out.println("The max number is: " + max);
    }
}



