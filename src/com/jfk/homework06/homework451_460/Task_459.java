package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_459 {
    public static void main(String[] args) {
        int[][] array = {
                {-1, -2, 3},
                {-3, 4, -5},
                {6, -7, 8},
        };
        int[] b = new int[3];

        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] < 0) {
                    product *= array[i][k];
                    b[i] = product;
                }
            }
        }
        ArrayElementGenerator.displayArray(b);
    }
}
