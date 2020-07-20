package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task435 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i; j++) {
                //System.out.print(x[i][j] + " ");
                if (x[i][j] % 5 == 0) {
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
