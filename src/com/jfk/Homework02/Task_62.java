package com.jfk.Homework02;

public class Task_62 {
    public static void main(String[] args) {
        int number = 5571;

        if (number < 5000) {
            int mid = (number % 1000) / 100;
            int last = number % 10;
            int a = number / (last + mid);
            System.out.println(a);
        } else {
            int first = number / 1000;
            int mid2 = (number % 100) / 10;
            int b = number / (first + mid2);
            System.out.println(b);
        }
    }
}
