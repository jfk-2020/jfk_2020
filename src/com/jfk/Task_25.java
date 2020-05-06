package com.jfk;

public class Task_25 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 9;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y = 1");
        } else
            System.out.println("y = 2");
    }
}
