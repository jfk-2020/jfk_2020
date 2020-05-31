package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task450 {
    public static void main(String[] args) {
        int n = 5;
        double[][] x = MatrixGenerator.generateAsRandomDouble(n, n);
        MatrixGenerator.display(x);
        double sum = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length - i; j < x[i].length; j++) {
                sum += x[i][j] - (int) x[i][j];
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
