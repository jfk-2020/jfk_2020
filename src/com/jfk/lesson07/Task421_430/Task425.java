package com.jfk.lesson07.Task421_430;

import com.jfk.lesson07.MatrixGenerator;

public class Task425 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i; j++) {
                if (x[i][j] % 2 == 0) {
                    count++;
                    //System.out.println(x[i][j]);
                }
            }
        }
        System.out.println(count);
    }
}
