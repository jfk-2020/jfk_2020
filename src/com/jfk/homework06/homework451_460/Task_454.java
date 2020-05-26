package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_454 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 1, 5},
        };

        int product = 1;
        int[] b = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                product *= Math.pow(array[i][k], 2);
            }
            b[i] = product;
        }
        ArrayElementGenerator.displayArray(b);
    }
}
