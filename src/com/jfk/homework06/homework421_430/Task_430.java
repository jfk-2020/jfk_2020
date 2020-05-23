package com.jfk.homework06.homework421_430;

public class Task_430 {
    public static void main(String[] args) {
        int[][] array = {
                {15, 12, 29},
                {2, 78, 90},
                {6, 35, 77},
        };
        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < i; m++) {
                if (array[i][m] % 2 == 0) {
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
