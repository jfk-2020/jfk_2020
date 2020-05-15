package com.jfk.homework04;

public class Task_95 {
    public static void main(String[] args) {
        int n = 10;
        double x = 0;
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                x = 1;

            } else {
                x = Math.pow(Math.sin(x), 2);
            }
            sum += Math.pow(x, 2) - x;
        }
        System.out.println(sum);
    }
}
