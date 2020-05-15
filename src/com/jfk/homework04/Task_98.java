package com.jfk.homework04;

public class Task_98 {
    public static void main(String[] args) {
        int n = 5;
        double x = 0;
        double sum = 0;

        for (int i = 1; i <= 2 * n; i++) {
            if (i == 1) {
                x = 3.4;
            } else {
                x = x - 7;
            }
            sum += x;
        }
        System.out.println(sum);
    }
}
