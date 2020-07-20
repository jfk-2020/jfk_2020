package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task433 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        int a = 0;
        int b = 50;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i; j++) {
                //System.out.print(x[i][j] + " ");
                if (a <= x[i][j] && x[i][j] <= b) {
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
