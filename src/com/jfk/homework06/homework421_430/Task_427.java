package com.jfk.homework06.homework421_430;

public class Task_427 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 6, 8},
                {2, 6, 4, 7},
                {3, 7, 9, 8},
                {21, 4, 5, 6},
        };

        int product = 1;
        int k = 3;
        for (int i = 0; i < array.length; i++) {
            for (int m = 0; m < array[i].length - i - 1; m++) {
                if (array[i][m] % k == 0) {
                    product *= array[i][m];
                }
                System.out.print(array[i][m] + " ");
            }
            System.out.println();
        }
        System.out.println(product);
    }
}
