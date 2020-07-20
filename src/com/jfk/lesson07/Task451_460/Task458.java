package com.jfk.lesson07.Task451_460;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task458 {
    public static void main(String[] args) {
        int m = 5;
        int k = 52;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            int count = 0;
            for (int j = 0; j < x[i].length; j++) {
                if (Math.abs(x[i][j]) > k) {
                    count++;
                }
            }
            B[i] = count;
        }
        ArrayGenerator.displayArray(B);
    }
}
