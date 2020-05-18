package com.jfk.homework05;

public class Task_222 {
    public static void main(String[] args) {
        int product = 1;
        int c = 0;
        int d = 3;

        int[] array = new int[]{2, 3, 5, 7, 9};

        if (c < 0 || c > array.length) {
            c = 0;
        }

        if (d <= c || d > array.length) {
            d = array.length;
        }

        for (int i = c; i < d; i++) {
            product *= array[i];
        }
        System.out.println(product);
    }
}

