package com.jfk.Lesson02;

public class Task021 {
    public static void main(String[] args) {
        int a = 33;
        int b = 99;
        int c = 100;
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println("max = " + max);
        System.out.println("max = " + Math.max(Math.max(a, b), c));
    }
}
