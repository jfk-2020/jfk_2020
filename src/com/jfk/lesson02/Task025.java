package com.jfk.lesson02;

public class Task025 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 7;//17;
        if (((a + b) > c) && ((a+c) > b) && ((b+c) > a)) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
    }
}
