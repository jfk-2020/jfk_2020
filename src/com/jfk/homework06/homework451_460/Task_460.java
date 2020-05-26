package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_460 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 4},
                {5, 6, 8},
                {9, 10, 12},
        };
        int[] b = new int[3];
        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] % 2 == 0) {
                    product *= Math.pow(array[i][k], 2);
                    b[i] = product;
                }
            }
        }
        ArrayElementGenerator.displayArray(b);
    }
}
