package com.jfk.homework04;

public class Task_99 {
    public static void main(String[] args) {
        int n = 2;
        double x = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 5;
            } else {
                x = Math.pow(x, 2) + 7;
            }
            sum += Math.pow(x, 2);
        }
        System.out.println(sum);
    }
}
