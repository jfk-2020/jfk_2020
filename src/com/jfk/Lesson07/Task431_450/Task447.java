package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task447 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 1;
        int a = 5;
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length - 1 - i; j < x[i].length; j++) {
                if (x[i][j] <= a && x[i][j] != 0) {
                    sum *= x[i][j];
                }
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
