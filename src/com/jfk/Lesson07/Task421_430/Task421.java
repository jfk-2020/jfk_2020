package com.jfk.Lesson07.Task421_430;

import com.jfk.Lesson07.MatrixGenerator;

public class Task421 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int k = 2;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i; j++) {
                if (x[i][j] % k == 0) {
                    sum++;
                    //System.out.println(x[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
