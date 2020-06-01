package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson07.MatrixGenerator;

import javax.print.DocFlavor;

public class Task499 {
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
        int averege = (max + min) / 2;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > averege && x[i][j] % 2 == 0) {
                    sum += x[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
