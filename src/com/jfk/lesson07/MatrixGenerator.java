package com.jfk.lesson07;

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

    public static double[][] generateAsRandomDouble(int rowCount, int columnCount) {
        double[][] array = new double[rowCount][columnCount];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int prefix = random.nextInt(11);
                if (prefix == 0) {
                    array[i][j] = 0;
                } else if (prefix % 2 == 0) {
                    array[i][j] = -1 * Math.round(random.nextDouble()*100000) / 100.0;
                } else {
                    array[i][j] = Math.round(random.nextDouble()*100000) / 100.0;
                }
            }
        }
        return array;
    }

    public static char[][] generateAsRandomChar(int rowCount, int columnCount) {
        char[][] array = new char[rowCount][columnCount];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (random.nextInt(2) == 0) {
                    array[i][j] = (char)('a' + random.nextInt(27));
                } else {
                    array[i][j] = (char)('A' + random.nextInt(27));
                }
            }
        }
        return array;
    }

    public static void display(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void display(double[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void display(char[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
