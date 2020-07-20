package com.jfk.lesson07.Task421_430;

import com.jfk.lesson07.MatrixGenerator;

public class Task427 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int k = 3;
        int sum = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i; j++) {
                //System.out.println(x[i][j]);
                if (x[i][j] % k == 0 && x[i][j] != 0) {
                    sum *= x[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
