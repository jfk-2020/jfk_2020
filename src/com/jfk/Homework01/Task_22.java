package com.jfk.Homework01;

public class Task_22 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 20;

        int min = 5;

        if (a < b) {
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else if (b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("The min number is: " + min);
    }
}

