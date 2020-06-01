package com.jfk.Lesson07.Tasks488_504;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task503 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------------");
        int[] b = new int[n];
        for (int i = 0; i < x.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 == 0 && min > x[i][j]) {
                    min = x[i][j];
                }
            }
            b[i] = min;
        }
        ArrayGenerator.displayArray(b);
    }
}
