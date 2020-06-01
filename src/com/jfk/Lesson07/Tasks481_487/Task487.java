package com.jfk.Lesson07.Tasks481_487;

import com.jfk.Lesson07.MatrixGenerator;

public class Task487 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println();
        boolean isSimetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    continue;
                }
                if (matrix[i][j] != matrix[j][i]) {
                    isSimetric = false;
                    break;
                }
            }
            if (!isSimetric) {
                break;
            }
        }
        if (!isSimetric) {
            System.out.println("NO");
        } else {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > 0) {
                        sum += matrix[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
