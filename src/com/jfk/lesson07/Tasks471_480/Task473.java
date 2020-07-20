package com.jfk.lesson07.Tasks471_480;

import com.jfk.lesson07.MatrixGenerator;

public class Task473 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    sum = i + j;
                }
            }
        }
        System.out.println(sum);
    }
}
