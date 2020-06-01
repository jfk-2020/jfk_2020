package com.jfk.Lesson07.Tasks481_487;

import com.jfk.Lesson07.MatrixGenerator;

public class Task483 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(matrix);
        System.out.println();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                sum += matrix[i][i];
                count++;
            }
            if (matrix[i][matrix[i].length - 1 - i] > 0 && i != (matrix[i].length - 1 - i)) {
                sum += matrix[i][matrix[i].length - 1 - i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println(count);
        } else {
            System.out.println(sum / count);
        }
    }
}
