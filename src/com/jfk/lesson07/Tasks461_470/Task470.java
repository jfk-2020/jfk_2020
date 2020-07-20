package com.jfk.lesson07.Tasks461_470;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task470 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == matrix[i][matrix[i].length - 1]) {
                X[i] = matrix[i][i];
            } else {
                X[i] = 0;
            }
        }
        ArrayGenerator.displayArray(X);
    }
}
