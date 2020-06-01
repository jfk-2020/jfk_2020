package com.jfk.Lesson07.Tasks481_487;

import com.jfk.Lesson07.MatrixGenerator;

public class Task482 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println();
        long sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    sum *= matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
