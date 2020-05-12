package com.jfk.Homework01;

public class Task_21 {

    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        int c = 20;

        int max = 50;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The max number is: " + max);
    }
}


