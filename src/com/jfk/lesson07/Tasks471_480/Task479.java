package com.jfk.lesson07.Tasks471_480;

import com.jfk.lesson07.MatrixGenerator;

public class Task479 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (min > matrix[i][i]) {
                min = matrix[i][i];
            }
        }
        System.out.println(min);
    }
}
