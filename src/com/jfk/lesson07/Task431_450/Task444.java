package com.jfk.lesson07.Task431_450;

import com.jfk.lesson07.MatrixGenerator;

public class Task444 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x[i].length; j++) {
                //System.out.print(x[i][j] + "  ");
                if (x[i][j] < 0 && (i + j) % 2 == 1) {
                    //System.out.println(x[i][j]);
                    count++;
                }
            }
            //System.out.println();
        }
        System.out.println(count);
    }
}
