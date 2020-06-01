package com.jfk.Lesson07.Tasks461_470;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task469 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(matrix);
        int[] X = new int[m];
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][matrix[i].length - 1 - i] >= 0) {
                continue;
            }
            boolean hasElements = false;
            for (int j = 0; j < matrix[i].length; j++){
                if (j == matrix[i][matrix[i].length - 1 - i]) {
                    continue;
                }
                if (matrix[i][j] < 0) {
                    hasElements = true;
                    System.out.println(j);
                    System.out.println(i);
                    for (int k = 0; k < matrix.length; k++) {
                        X[k] = matrix[k][j];
                    }
                    break;
                }
            }
            if (hasElements) {
                break;
            }
        }
        ArrayGenerator.displayArray(X);
    }
}
