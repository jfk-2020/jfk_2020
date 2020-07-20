package com.jfk.lesson07.Task451_460;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task455 {
    public static void main(String[] args) {
        int m = 5;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            B[i] = (x[i][i] * x[i][x[i].length - i - 1]);
        }
        ArrayGenerator.displayArray(B);
    }
}
