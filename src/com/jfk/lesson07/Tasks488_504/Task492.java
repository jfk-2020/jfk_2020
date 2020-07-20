package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson07.MatrixGenerator;

public class Task492 {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        int[][] x = MatrixGenerator.generateAsRandom(m, n);
        MatrixGenerator.display(x);
        System.out.println("-----------------------------------");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (max < x[i][j]) {
                    max = x[i][j];
                    iMax = i;
                }
                if (min > x[i][j]) {
                    min = x[i][j];
                    iMin = i;
                }
            }
        }
        if (iMax != iMin) {
            for (int i = 0; i < x[0].length; i++) {
                x[iMax][i] = x[iMax][i] + x[iMin][i];
                x[iMin][i] = x[iMax][i] - x[iMin][i];
                x[iMax][i] = x[iMax][i] - x[iMin][i];
            }
        }
        MatrixGenerator.display(x);
    }
}
