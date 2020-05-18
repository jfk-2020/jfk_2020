package com.jfk.homework05;

public class Task_222 {
    public static void main(String[] args) {
        int product = 1;
        int c = 0;
        int d = 3;

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

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

