package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task449 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length - i - 1; j++) {
                //System.out.print(x[i][j] + " ");
                if (x[i][j] % 4 == 0) {
                    sum += x[i][j];
                 }
            }
            //System.out.println();
        }
        System.out.println(sum);
    }
}
