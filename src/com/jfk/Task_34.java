package com.jfk;

public class Task_34 {
    public static void main(String[] args) {
        int a = 50;
        int b = 36;
        int c = 52;
        int d = 38;

        boolean z = (a + b == c + d || a + c == b + d || a + d == b + c);
        System.out.println(z);
    }
    }

