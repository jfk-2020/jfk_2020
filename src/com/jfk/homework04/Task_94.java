package com.jfk.homework04;

public class Task_94 {
    public static void main(String[] args) {
        int n = 10;
        double x = 0;
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                x = -4.2;
            } else {
                x = 0.5 * 1/ Math.tan(x);
            }
            sum += Math.pow(x, 2) - (2 * x);
        }
        System.out.println(sum);
    }
}
