package com.jfk.homework06.homework451_460;

public class Task_452 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 8},
                {3, 6, 9},
                {7, 4, 3},
        };

        int[] b = new int[3];

        for (int i = 0; i < array.length; i++) {
            b[i] = (int) Math.pow(array[i][0], 2) + (int) Math.pow(array[i][array.length - 1], 2);
            System.out.println(b[i]);
        }
    }
}
