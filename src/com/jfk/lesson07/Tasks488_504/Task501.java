package com.jfk.lesson07.Tasks488_504;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task501 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------------");
        int[] b = new int[n];
        for (int i = 0; i < x.length; i++) {
            b[i] = 1;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 == 0 && (i + j) % 2 == 1 && x[i][j] < x[i][i]) {
                    b[i] *= x[i][j];
                }
            }
        }
        ArrayGenerator.displayArray(b);
    }
}
