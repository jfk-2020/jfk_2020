package com.jfk.homework04;

public class Task_93 {
    public static void main(String[] args) {
        int n = 23;
        double x = 0;
        double product = 1;

        for (int i = 5; i <= n; i++) {
            if (i == 5) {
                x = 0.5;
            } else {
                x = Math.tan(x + 2);
            }
            product *= Math.pow(x, 2);

        }
        System.out.println(product);
    }
}
