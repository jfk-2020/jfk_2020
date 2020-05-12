package com.jfk.homework02;

public class Task_65 {
    public static void main(String[] args) {
        int number = 5626;

        int mid2 = (number % 100) / 10;
        int last = number % 10;
        int y;
        if (last * mid2 == 12) {
            y = 12;
        } else {
            y = 0;
        }
        System.out.println("y = " + y);
    }
}
