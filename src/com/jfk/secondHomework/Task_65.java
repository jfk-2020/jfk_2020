package com.jfk.secondHomework;

public class Task_65 {
    public static void main(String[] args) {
        int number = 5626;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;
        int y;
        int product = last * mid2;
        if (product == 12) {
            y = 12;
        } else {
            y = 0;
        }
        System.out.println(y);
    }
}
