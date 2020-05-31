package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task446 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 0;
        int a = 0;
        int b = 50;
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x[i].length; j++) {
                //System.out.print(x[i][j] + "  ");
                if (a <= x[i][j] && x[i][j] <= b) {
                    //System.out.println(x[i][j]);
                    sum += x[i][j];
                }
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
