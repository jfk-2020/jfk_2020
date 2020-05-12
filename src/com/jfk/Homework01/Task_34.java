package com.jfk.Homework01;

public class Task_34 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;
        int d = 8;

        if (a + b == c + d) {
            System.out.println(true);
        } else if (a + c == b + d) {
            System.out.println(true);
        } else if (a + d == b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
