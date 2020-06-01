package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson07.MatrixGenerator;

public class Task495 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, 2*n);
        MatrixGenerator.display(x);
        System.out.println("----------------------------------------------------");
        int k = x[0].length - 1;
        for (int i = 0; i < x.length; i++) {
            for (int j= 0; j < x.length - 1; j++) {
                if (x[j][k] < x[j + 1][k]) {
                    x[j][k] = x[j + 1][k] + x[j][k];
                    x[j + 1][k] = x[j][k] - x[j + 1][k];
                    x[j][k] = x[j][k] - x[j + 1][k];
                }
            }
        }
        MatrixGenerator.display(x);
    }
}
