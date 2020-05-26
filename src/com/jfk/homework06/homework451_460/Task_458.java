package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_458 {
    public static void main(String[] args) {
        int[][] array = {
                {7, 8, 12},
                {17, 23, 5},
                {13, 20, 25},
        };

        int[] b = new int[3];
        int k = 11;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int n = 0; n < array[i].length; n++)
                if (array[i][n] > k) {
                    count++;
                    b[i] = count;
                }
        }
        ArrayElementGenerator.displayArray(b);
    }
}
