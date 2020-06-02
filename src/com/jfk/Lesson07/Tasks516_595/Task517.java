package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task517 {
    public static void main(String[] args) {
        int M = 5;
        int N = 6;
        int[][] x = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                x[i][j] = 7 * (j + 1);
            }
        }
        MatrixGenerator.display(x);
    }
}
