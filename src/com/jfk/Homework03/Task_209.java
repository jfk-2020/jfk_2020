package com.jfk.Homework03;

public class Task_209 {
    public static void main(String[] args) {
        int n = 8857;
        int a = 0;
        boolean t = false;

        while (n != 0) {
            a = n % 10;
            n = n / 10;

            if (a % 2 != 0) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}