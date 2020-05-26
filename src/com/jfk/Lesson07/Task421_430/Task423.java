package com.jfk.Lesson07.Task421_430;

import com.jfk.Lesson07.MatrixGenerator;

public class Task423 {
    public static void main(String[] args) {
        int m = 4;
        int[][] x = MatrixGenerator.generateAsRandom(m, m);
        MatrixGenerator.display(x);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (x[i][j] % 2 == 0) {
                    sum += x[i][j] * x[i][j];
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
