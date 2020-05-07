package com.jfk.secondHomework;

public class Task_64 {
    public static void main(String[] args) {
        int number = 5623;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        int sum = last + mid2;
        String y;
        if (sum == 5) {
            y = "s";
        } else {
            y = "d";
        }
        System.out.println(y);
    }
}
