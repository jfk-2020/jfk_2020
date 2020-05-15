package com.jfk;

public class Task_68 {
    public static void main(String[] args) {
        int number = 9998;
        int j =  number % 10;
        int k = (number / 10) % 10;
        int k1 = (number / 100) % 10;
        int s = number / 1000;

        if (j > k) {
            System.out.println((double) j * k1);
        } else {
            System.out.println("1");
        }
    }
}
