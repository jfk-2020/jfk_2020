package com.jfk.firstHomework;

public class Task_30 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 5;

        if (a > b && a > c && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b > a && b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a && c > b && b > a) {
            System.out.println(c + " " + b + " " + a);
        } else if (b > a && b > c && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (c > b && a > b && c > a) {
            System.out.println(c + " " + a + " " + b);
        } else if (c > b && a > b && a > c) {
            System.out.println(a + " " + c + " " + b);
        }
    }
}

