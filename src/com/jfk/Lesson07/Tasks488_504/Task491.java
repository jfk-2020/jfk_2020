package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson07.MatrixGenerator;

import javax.imageio.ImageTranscoder;

public class Task491 {
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
        if (ii != 0) {
            for (int i = 0; i < x[0].length; i++) {
                x[0][i] = x[0][i] + x[ii][i];
                x[ii][i] = x[0][i] - x[ii][i];
                x[0][i] = x[0][i] - x[ii][i];
            }
        }
        if (jj != 0) {
            for (int i = 0; i < x.length; i++) {
                x[i][0] = x[i][0] + x[i][jj];
                x[i][jj] = x[i][0] - x[i][jj];
                x[i][0] = x[i][0] - x[i][jj];
            }
        }
        MatrixGenerator.display(x);
    }
}
