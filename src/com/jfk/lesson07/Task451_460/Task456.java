package com.jfk.lesson07.Task451_460;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task456 {
    public static void main(String[] args) {
        int m = 5;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            int count = 0;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > 0) {
                    count++;
                }
            }
            B[i] = count;
        }
        ArrayGenerator.displayArray(B);
    }
}
