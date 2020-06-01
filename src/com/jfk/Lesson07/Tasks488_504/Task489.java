package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task489 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("-------------------------------");
        int[] b = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    b[i] = matrix[i][j];
                    break;
                }
            }
        }
        ArrayGenerator.displayArray(b);
    }
}
