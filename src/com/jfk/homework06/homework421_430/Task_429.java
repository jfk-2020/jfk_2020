package com.jfk.homework06.homework421_430;

public class Task_429 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 13, 6, 7},
                {10, 6, 8, 9},
                {2,  5, 6, 3},
                {10, 10, 9, 2},
        };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < array[i].length - i - 1; m++) {
                if (array[i][m] / 5 == 2 && array[i][m] % 5 == 0)
                    count++;

                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
