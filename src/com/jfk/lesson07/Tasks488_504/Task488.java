package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task488 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("-------------------------------");
        int[] b = new int[n];
        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            b[i] = max;
        }
        ArrayGenerator.displayArray(b);
    }
}
