package com.jfk;

public class Task_51 {
    public static void main(String[] args) {
        int number = 459;

        int k = number / 100;
        int t = (number % 100) / 10;
        int y = number % 10;

        System.out.println(k == t + y);
    }
    }

