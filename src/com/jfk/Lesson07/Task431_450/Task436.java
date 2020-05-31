package com.jfk.Lesson07.Task431_450;

import com.jfk.Lesson07.MatrixGenerator;

public class Task436 {
    public static void main(String[] args) {
        int n = 5;
        int[][] x = MatrixGenerator.generateAsRandom(n, n);
        MatrixGenerator.display(x);
        int sum = 0;
        int count = 0;
        double a = 0;
        double b = 50;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                //System.out.print(x[i][j] + "  ");
                if (a <= x[i][j] && x[i][j] <= b) {
                    sum += x[i][j];
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
