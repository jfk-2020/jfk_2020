package com.jfk;

public class Task_56 {
    public static void main(String[] args) {

        int number = 423;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        int sum = f + m + l;
        int subtraction = sum - number;

        if (l > m) {
            System.out.println(subtraction);
        } else {
            System.out.println(number);
        }
    }
}
