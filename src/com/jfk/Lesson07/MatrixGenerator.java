package com.jfk.Lesson07;

import java.util.Random;

public class MatrixGenerator {
    private static final Random random = new Random();

    public static int[][] generateAsRandom(int rowCount, int columnCount) {
        int[][] array = new int[rowCount][columnCount];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int prefix = random.nextInt(11);
                if (prefix == 0) {
                    array[i][j] = 0;
                } else if (prefix % 2 == 0) {
                    array[i][j] = -1 * random.nextInt(100);
                } else {
                    array[i][j] = random.nextInt(100);
                }
            }
        }
        return array;
    }

    public static void display(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
