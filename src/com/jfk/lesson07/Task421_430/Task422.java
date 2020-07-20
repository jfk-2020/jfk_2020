package com.jfk.lesson07.Task421_430;

import com.jfk.lesson07.MatrixGenerator;

public class Task422 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int k = 2;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i; j++) {
                if (x[i][j] % k == 0) {
                    sum += x[i][j];
                    count++;
                    //System.out.println(x[i][j]);
                }
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}
