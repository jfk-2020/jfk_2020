package com.jfk;

public class task_22 {
    public static void main(String[] args) {
        int a = 13;
        int b = 18;
        int c = 49;
        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println("min = " + min);
        System.out.println("main = " + Math.min(Math.min(a, b), c));
    }
}