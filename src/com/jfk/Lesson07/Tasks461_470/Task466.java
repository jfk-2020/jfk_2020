package com.jfk.Lesson07.Tasks461_470;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task466 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        for (int i = 0; i < matrix.length; i++) {
            int x = -3;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j - 1] > matrix[i][j]) {
                    x = 3;
                    break;
                }
            }
            X[i ] = x;
        }
        ArrayGenerator.displayArray(X);
    }
}
