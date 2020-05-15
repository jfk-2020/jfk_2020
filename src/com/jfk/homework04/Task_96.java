package com.jfk.homework04;

public class Task_96 {
    public static void main(String[] args) {
        int n = 13;
        double x = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                x = 22;
            } else {
                x = x - 3.4;
            }
            sum += Math.pow(x, 2);
        }
        System.out.println(sum);
    }
}
