package com.jfk.Lesson07.Tasks516_595;

import com.jfk.Lesson07.MatrixGenerator;

public class Task527 {
    public static void main(String[] args) {
        int M = 4;
        int N = 5;
        int[][] x = MatrixGenerator.generateAsRandom(M, N);
        MatrixGenerator.display(x);
        System.out.println("--------------------------------");
        int K = 3;
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += x[i][K];
        }
        System.out.println(sum);
    }
}
