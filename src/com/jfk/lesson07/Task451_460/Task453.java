package com.jfk.lesson07.Task451_460;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task453 {
    public static void main(String[] args) {
        int m = 5;
        int a = 0;
        int b = 50;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            int sum = 0;
            for (int j = 0; j < x[i].length; j++) {
                if (a <= x[i][j] && x[i][j] <= b) {
                    sum += x[i][j];
                }
            }
            B[i] = sum;
        }
        ArrayGenerator.displayArray(B);
    }
}
