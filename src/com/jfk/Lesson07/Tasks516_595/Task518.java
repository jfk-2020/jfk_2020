package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task518 {
    public static void main(String[] args) {
        int M = 5;
        int N = 6;
        int[] x = ArrayGenerator.generateAsRandom(M);
        ArrayGenerator.displayArray(x);
        System.out.println("-------------------------------");
        int[][] y = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                y[i][j] = x[i];
            }
        }
        MatrixGenerator.display(y);
    }
}
