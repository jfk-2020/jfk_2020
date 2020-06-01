package com.jfk.Lesson07.Tasks481_487;

import com.jfk.Lesson07.MatrixGenerator;

public class Task481 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        int sum = (min + max) / 2;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > sum) {
                    count++;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
}
