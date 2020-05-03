package com.jfk.Lesson02;

public class Task022 {
    public static void main(String[] args) {
        int a = 33;
        int b = 99;
        int c = 100;
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println("min = " + min);
        System.out.println("main = " + Math.min(Math.min(a, b), c));
    }
}
