package com.jfk.lesson07.Tasks516_595;

import com.jfk.lesson07.MatrixGenerator;

public class Task528 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += x[i][j];
            }
            System.out.println(sum);
        }
    }
}
