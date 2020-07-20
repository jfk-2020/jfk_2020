package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task434 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 0;
        double a = 5.4;
        double b = 15.3;
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length - 1 - i; j < x[i].length; j++) {
                if (a <= Math.abs(x[i][j]) && Math.abs(x[i][j]) <= b) {
                    sum += x[i][j];
                }
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
