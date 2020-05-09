package com.jfk;

public class Task_61 {
    public static void main(String[] args) {

        int number = 5612;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        boolean t;

        if (last + mid2 == mid + first) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }
}
