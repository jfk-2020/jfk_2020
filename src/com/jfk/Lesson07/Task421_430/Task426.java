package com.jfk.Lesson07.Task421_430;

import com.jfk.Lesson07.MatrixGenerator;

public class Task426 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i - 1; j++) {
                System.out.println(x[i][j]);
                if (x[i][j] % 2 == 0) {
                    sum += x[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
