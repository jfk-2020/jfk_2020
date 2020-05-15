package com.jfk.homework04;

public class Task_91 {
    public static void main(String[] args) {
        int n = 23;
        double x = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 1;
            } else {
                x = 0.5 * Math.abs(x - 4);
            }
            sum += Math.pow(x, 2);
        }
        System.out.println(sum);
    }
}
