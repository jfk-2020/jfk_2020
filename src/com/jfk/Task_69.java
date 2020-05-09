package com.jfk;

public class Task_69 {
    public static void main(String[] args) {
        int number = 4512;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        int y;
        int sum = last + mid2 + mid + first;
        if (sum > 20) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println(y);
    }
}
