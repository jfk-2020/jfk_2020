package com.jfk.homework04;

public class Task_97 {
    public static void main(String[] args) {
        int n = 15;
        double x = 0;
        double product = 1;

        for (int i = 0; i <= 3 * n; i++) {
            if (i == 0) {
                x = 1;
            } else {
                x = x + 7;
            }
            product *= x;
        }
        System.out.println(product);
    }
}
