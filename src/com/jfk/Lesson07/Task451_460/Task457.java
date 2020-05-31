package com.jfk.Lesson07.Task451_460;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task457 {
    public static void main(String[] args) {
        int m = 5;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            int sum = 0;
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 == 1) {
                    sum += x[i][j];
                }
            }
            B[i] = sum;
        }
        ArrayGenerator.displayArray(B);
    }
}
