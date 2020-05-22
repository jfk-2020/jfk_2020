package com.jfk.homework06.homework421_430;

public class Task_422 {
    public static void main(String[] args) {
        int[][] array = {
                {15, 12, 29},
                {46, 78, 90},
                {15, 35, 77},
        };
        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < i; m++) {
                if (array[i][m] % 5 == 0) {
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
