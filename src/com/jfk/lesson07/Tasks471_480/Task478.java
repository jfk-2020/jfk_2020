package com.jfk.lesson07.Tasks471_480;

import com.jfk.lesson07.MatrixGenerator;

public class Task478 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i][matrix[i].length - 1 - i]) {
                max = matrix[i][matrix[i].length - 1 - i];
            }
        }
        System.out.println(max);
    }
}
