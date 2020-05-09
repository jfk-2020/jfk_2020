package com.jfk;

public class Task_51 {
    public static void main(String[] args) {
        int number = 715;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        boolean t = (f == m + l);
        System.out.println(t);
    }
}
