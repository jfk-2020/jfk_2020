package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task438 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                //System.out.print(x[i][j] + "  ");
                if (j % 2 == 0 && x[i][j] > 0) {
                    //System.out.println(x[i][j]);
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
