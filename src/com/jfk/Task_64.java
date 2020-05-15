package com.jfk;

public class Task_64 {
    public static void main(String[] args) {
        int number = 2641;
        int j = (number % 10); // number % 10
        int k = (number % 100) / 10; // (number / 10) % 10
        int k1 = (number % 1000) / 100; // (number / 100) % 10
        int s = (number % 10000) / 1000; // number / 1000
        char y = 'd';

        if (j + k == 5)
            y = 's';
        System.out.println(y);
    }
}
