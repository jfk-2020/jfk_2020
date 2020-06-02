package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task521 {
    public static void main(String[] args) {
        int M = 5;
        int N = 6;
        int D = 2;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        System.out.println("-------------------------------");
        int[][] y = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                y[i][j] = x[j] * (int)Math.pow(D, i);
            }
        }
        MatrixGenerator.display(y);
    }
}
