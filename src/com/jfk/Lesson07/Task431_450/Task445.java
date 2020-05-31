package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task445 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int k = 50;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i; j++) {
                //System.out.print(x[i][j] + "  ");
                if (Math.abs(x[i][j]) < k) {
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
