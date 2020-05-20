package com.jfk;

public class Task_222 {
    public static void main(String[] args) {
        int product = 1;
        int c = 0;
        int d = 8;

        int[] array = new int[]{4, 6, 8, 10, 20};

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
