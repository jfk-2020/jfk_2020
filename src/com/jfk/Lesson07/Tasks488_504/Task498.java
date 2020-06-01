package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson07.MatrixGenerator;

public class Task498 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------------");
        for (int i = 0; i < x.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < x[i].length; j++) {
                if (min > x[i][j]) {
                    min = x[i][j];
                }
            }
            x[i][x[i].length - 1 - i] = min;
        }
        MatrixGenerator.display(x);
    }
}
