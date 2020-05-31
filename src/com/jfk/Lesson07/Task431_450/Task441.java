package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task441 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x[i].length; j++) {
                //System.out.print(x[i][j] + "  ");
                if (x[i][j] > 0) {
                    //System.out.println(x[i][j]);
                    sum += x[i][j] - x[i][j];
                    count++;
                }
            }
            //System.out.println();
        }
        if (count == 0) {
            System.out.println(count);
        } else {
            System.out.println(sum / count);
        }
    }
}
