package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task432 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i; j++) {
                //System.out.print(x[i][j] + " ");
                if ((i + j) % 2 == 1) {
                    sum += x[i][j] * x[i][j];
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(sum / count);
    }
}
