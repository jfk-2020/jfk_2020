package com.jfk.Homework01;

public class Task_35 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int d = 10;

        if (a == b + c + d) {
            System.out.println(true);
        } else if (b == a + c + d) {
            System.out.println(true);
        } else if (c == a + b + d) {
            System.out.println(true);
        } else if (d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}