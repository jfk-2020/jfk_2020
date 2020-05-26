package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_456 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, -8, 7},
                {3, -5, 8, -2},
                {4, 7, 6, 12},
                {-3, 2, 6, 8},
        };

        int[] b = new int[4];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int k = 0; k < array[i].length; k++)
                if (array[i][k] > 0) {
                    count++;
                    b[i] = count;
                }
        }
        ArrayElementGenerator.displayArray(b);
    }
}
