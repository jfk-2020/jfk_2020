package com.jfk.Lesson07.Task451_460;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task452 {
    public static void main(String[] args) {
        int m = 5;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int[] B = new int[m];
        for (int i = 0; i < x.length; i++){
            B[i] = (int)(Math.pow(x[i][i], 2) + Math.pow(x[i][x[i].length - 1], 2));
        }
        ArrayGenerator.displayArray(B);
    }
}
