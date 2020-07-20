package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson07.MatrixGenerator;

public class Task500 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------------");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (max < x[i][j]) {
                    max = x[i][j];
                }
                if (min > x[i][j]) {
                    min = x[i][j];
                }
            }
        }
        int sumMax = 1;
        int sumMIn = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] == max) {
                    sumMax *= x[i][j];
                }
                if (x[i][j] == min) {
                    sumMIn *= x[i][j];
                }
            }
        }
        System.out.println((sumMax + sumMIn) / 2);

    }
}
