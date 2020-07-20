package com.jfk.lesson07.Tasks461_470;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task467 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        for (int i = 0; i < matrix.length; i++) {
            int x = matrix[i][matrix[i].length - 1];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    x = matrix[i][0];
                    break;
                }
            }
            X[i] = x;
        }
        ArrayGenerator.displayArray(X);
    }
}
