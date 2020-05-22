package com.jfk.homework06.homework421_430;

public class Task_424 {
    public static void main(String[] args) {
        int[][] array = {
                {19, 27, 87},
                {3, 25, 87},
                {6, 77, 7},
        };

        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < i; m++) {
                if (array[i][m] % 2 != 0) {
                    count++;
                    sum += array[i][m];
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(sum / count);
    }
}

