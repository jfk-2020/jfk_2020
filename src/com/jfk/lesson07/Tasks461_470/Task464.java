package com.jfk.lesson07.Tasks461_470;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task464 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 1;
            for (int j = i; j < matrix[i].length; j++) {
                sum *= matrix[i][j];
            }
            X[i] = sum;
        }
        ArrayGenerator.displayArray(X);
    }
}
