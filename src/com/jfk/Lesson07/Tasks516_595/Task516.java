package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task516 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                x[i][j] = 10 * (i + 1);
            }
        }
        MatrixGenerator.display(x);
    }
}
