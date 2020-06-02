package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task530 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j+=2) {
                sum += x[i][j];
            }
        }
        System.out.println(sum);
    }
}
