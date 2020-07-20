package com.jfk.lesson07.Tasks471_480;

import com.jfk.lesson07.MatrixGenerator;

public class Task477 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int min = Integer.MAX_VALUE;
        int l = 2;
        for (int i = 0; i < matrix.length; i++) {
            if (min > matrix[i][l]) {
                min = matrix[i][l];
            }
        }
        System.out.println(min);
    }
}
