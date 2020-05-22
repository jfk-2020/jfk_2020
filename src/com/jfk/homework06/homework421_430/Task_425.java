package com.jfk.homework06.homework421_430;

public class Task_425 {
    public static void main(String[] args) {
        int[][] array = {
                {2, 4, 6, 9},
                {7, 19, 30, 23},
                {2, 8, 12, 26},
                {4, 9, 17, 23},
        };

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < i; m++) {
                if (array[i][m] % 2 == 0) {
                    count++;
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
