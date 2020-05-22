package com.jfk.homework06.homework421_430;

public class Task_421 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 7, 9},
                {3, 21, 3},
                {4, 6, 12},
        };

        int count = 0;
        int k = 3;
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < i; m++) {
                if (array[i][m] % k == 0) {
                    count++;
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
