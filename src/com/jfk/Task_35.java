package com.jfk;

public class Task_35 {
    public static void main(String[] args) {
        int a = 8;
        int b = 17;
        int c = 14;
        int d = 40;

        boolean f = (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c);
        System.out.println(f);
    }
    }

