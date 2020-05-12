package com.jfk.homework02;

public class Task_70 {
    public static void main(String[] args) {

        int number = 1234;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        int y;
        int product = last * mid2 * mid * first;
        if (product > 200) {
            y = 0;
        } else {
            y = 1;
        }
        System.out.println(y);
    }
}
