package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson07.MatrixGenerator;

import javax.swing.plaf.IconUIResource;

public class Task493 {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        int[][] x = MatrixGenerator.generateAsRandom(m, n);
        MatrixGenerator.display(x);
        System.out.println("-----------------------------------");
        int max = Integer.MIN_VALUE;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (max < x[i][j]) {
                    max = x[i][j];
                    ii = i;
                    jj = j;
                }
            }
        }
        int[][] y = new int[m - 1][n - 1];
        int iy = 0;
        for (int i = 0; i < x.length; i++) {
            if (i == ii) {
                continue;
            }
            int jy = 0;
            for (int j = 0; j < x[i].length; j++) {
                if (j == jj) {
                    continue;
                }
                y[iy][jy++] = x[i][j];
            }
            iy++;
        }
        MatrixGenerator.display(y);
    }
}
