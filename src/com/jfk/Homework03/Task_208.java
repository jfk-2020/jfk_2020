package com.jfk.Homework03;

public class Task_208 {
    public static void main(String[] args) {
        int n = 1234;
        int a = 0;
        boolean t = false;

        while (n != 0) {
            a = n % 10;
            n = n / 10;

            if (n == a) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}


