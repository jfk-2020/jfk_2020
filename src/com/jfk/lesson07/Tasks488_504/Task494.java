package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson07.MatrixGenerator;

public class Task494 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, 2*n);
        MatrixGenerator.display(x);
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < x.length; i++) {
            for (int j= 0; j < x.length - 1; j++) {
                if (x[j][0] > x[j + 1][0]) {
                    x[j][0] = x[j + 1][0] + x[j][0];
                    x[j + 1][0] = x[j][0] - x[j + 1][0];
                    x[j][0] = x[j][0] - x[j + 1][0];
                }
            }
        }
        MatrixGenerator.display(x);
    }
}
