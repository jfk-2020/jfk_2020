package com.jfk.lesson07.Tasks461_470;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task465 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        int b = 10;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            int x = (sum < b) ? 0 : 1;
            X[i] = x;
        }
        ArrayGenerator.displayArray(X);
    }
}
