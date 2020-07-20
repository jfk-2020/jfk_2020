package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson07.MatrixGenerator;

public class Task497 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------------");
        for (int i = 0; i < x.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < x[i].length; j++) {
                if (max < x[i][j]) {
                    max = x[i][j];
                }
            }
            x[i][i] = max;
        }
        MatrixGenerator.display(x);
    }
}
