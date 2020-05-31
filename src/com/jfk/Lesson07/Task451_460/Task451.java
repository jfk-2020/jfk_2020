package com.jfk.Lesson07.Task451_460;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task451 {
    public static void main(String[] args) {
        int m = 5;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            B[i] = (x[i][i] + x[i][x[i].length - i - 1]) / 2;
        }
        ArrayGenerator.displayArray(B);
    }
}
