package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_453 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 8, 7, 9},
                {3, 6, 2, 3, 5},
                {7, 4, 3, 2, 5},
                {1, 5, 8, 7, 9},
                {1, 5, 8, 7, 9},
        };

        int[] c = new int[5];
        int a = 1;
        int b = 3;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int k = a; k <= b; k++) {
                sum += array[i][k];
            }
            c[i] = sum;
        }
        ArrayElementGenerator.displayArray(c);
    }
}
