package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task431 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length - 1 - i; j < x[i].length; j++) {
                //System.out.print(x[i][j] + " ");
                if ((i + j) % 2 == 1) {
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
