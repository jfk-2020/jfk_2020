package com.jfk.homework03;

public class Task_166 {
    public static void main(String[] args) {
        int y = 1;
        int n = 64;

        while (n > 1) {
            if (n % 4 == 0) {
                n = n / 4;

            } else {
                y = 0;
                break;
            }
        }
        System.out.println(y);
    }
}