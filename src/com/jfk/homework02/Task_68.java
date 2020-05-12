package com.jfk.homework02;

public class Task_68 {
    public static void main(String[] args) {
        int number = 1231;

        int mid = (number % 1000) / 100;
        int last = number % 10;

        if (last > mid) {
            System.out.println(last * mid);
        } else {
            System.out.println(1);
        }
    }
}
