package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_457 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[] b = new int[4];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int k = 0; k < array[i].length; k++) {

                if (array[i][k] % 2 != 0) {
                    sum += array[i][k];
                    b[i] = sum;
                }
            }
        }
        ArrayElementGenerator.displayArray(b);
    }

}
