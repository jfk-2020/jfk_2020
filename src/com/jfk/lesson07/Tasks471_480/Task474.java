package com.jfk.lesson07.Tasks471_480;

import com.jfk.lesson07.MatrixGenerator;

public class Task474 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int min = Integer.MAX_VALUE;
        int sum = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    sum = i*j;
                }
            }
        }
        System.out.println(sum);
    }
}
