package com.jfk.lesson07.Task451_460;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task460 {
    public static void main(String[] args) {
        int m = 5;
        int a = 0;
        int b = 50;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        double[] B = new double[m];
        for (int i = 0; i < x.length; i++){
            double sum = 1;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 == 0) {
                    sum *= x[i][j] * x[i][j];
                }
            }
            B[i] = sum;
        }
        ArrayGenerator.displayArray(B);
    }
}
