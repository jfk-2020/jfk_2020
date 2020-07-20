package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task439 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x[i].length; j++) {
                //System.out.print(x[i][j] + "  ");
                if ((i + j) % 2 == 1 && x[i][j] != 0) {
                    //System.out.println(x[i][j]);
                    sum *= x[i][j];
                }
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
