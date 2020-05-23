package com.jfk.homework06.homework421_430;

public class Task_426 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 7, 18, 27},
                {15, 23, 4, 3},
                {6, 7, 3, 2},
                {3, 5, 9, 8},
        };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < array[i].length - i - 1; m++) {
                if (array[i][m] % 2 == 0) {
                    sum += array[i][m];
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }

}
