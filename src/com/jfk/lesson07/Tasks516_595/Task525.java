package com.jfk.lesson07.Tasks516_595;

import com.jfk.lesson07.MatrixGenerator;

public class Task525 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (j % 2 == 1) {
                    System.out.print(x[i][j] + "  ");
                } else {
                    System.out.print(x[x.length - 1 - i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
