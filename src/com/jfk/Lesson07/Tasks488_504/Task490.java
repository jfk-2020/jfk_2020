package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task490 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("-------------------------------");
        int[] b = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            boolean isNegative = false;
            int sum = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (isNegative) {
                    sum += matrix[i][j];
                }
                if (matrix[i][j] < 0 && !isNegative) {
                    isNegative = true;
                }
            }
            b[i] = sum;
        }
        ArrayGenerator.displayArray(b);
    }
}
