package com.jfk.homework06.homework421_430;

public class Task_428 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 8, 10},
                {3, 5, 6, 4},
                {0, 8, 3, 5},
                {0, 3, 4, 3},
        };
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < array[i].length - i; m++) {
                if (array[i][m] == 0) {
                    count++;
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
