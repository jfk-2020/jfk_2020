package com.jfk.homework03;

public class Task_165 {
    public static void main(String[] args) {
        int n = 81;
        boolean t = true;

        while (n > 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}
