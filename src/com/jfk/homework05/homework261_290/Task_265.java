package com.jfk.homework05.homework261_290;

public class Task_265 {
    public static void main(String[] args) {
        int[] x = new int[]{3, 5, 7, 9};
        int[] y = new int[]{2, 4, 6, 1};

        int sum = 0;
        int product = 1;
        int sub = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] != 0) {
                product *= y[i];
            }
        }
        sub = sum - product;
        System.out.println(sub);
    }
}
