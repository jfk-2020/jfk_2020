package com.jfk.homework06.homework451_460;

import com.jfk.ArrayElementGenerator;

public class Task_455 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 9, 3},
                {4, 2, 6},
                {7, 8, 3},
        };

        int[] b = new int[3];

        for(int i = 0; i < array.length; i++){
            b[i] = ((array[i][i]) * (array[i][array.length - 1 - i]));
        }
        ArrayElementGenerator.displayArray(b);
    }
}
