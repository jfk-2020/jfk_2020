package com.jfk.Lesson07.Tasks481_487;

import com.jfk.Lesson07.MatrixGenerator;

public class Task485 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println();
        int max = Integer.MIN_VALUE;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    ii = i;
                    jj = j;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][jj];
        }
        for (int i = 0; i < matrix[ii].length; i++) {
            if (i == jj) {
                continue;
            }
            sum += matrix[ii][i];
        }
        System.out.println(sum);
    }
}
