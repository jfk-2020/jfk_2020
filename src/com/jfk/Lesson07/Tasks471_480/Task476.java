package com.jfk.Lesson07.Tasks471_480;

import com.jfk.Lesson07.MatrixGenerator;

public class Task476 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println("---------------------------");
        int k =3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[k].length; i++) {
            if (max < matrix[k][i]) {
                max = matrix[k][i];
            }
        }
        System.out.println(max);
    }
}