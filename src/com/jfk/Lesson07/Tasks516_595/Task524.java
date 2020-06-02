package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task524 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(x[i][j] + "  ");
                }
            } else {
                for (int j = 0; j < N; j++) {
                    System.out.print(x[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
