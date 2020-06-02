package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task522 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        for (int i = 0; i < M; i += 2) {
            for (int j = 0; j < N; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
