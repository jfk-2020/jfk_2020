package com.jfk.firstHomework;

public class Task_37 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        if (d - c == c - b && c - b == b - a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
