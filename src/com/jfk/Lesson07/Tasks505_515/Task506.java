package com.jfk.Lesson07.Tasks505_515;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task506 {
    public static void main(String[] args) {
        int k = 5;
        int[][] z = MatrixGenerator.generateAsRandom(k, k);
        MatrixGenerator.display(z);
        System.out.println("------------------------------------");
        int c = 50;
        int[] b = new int[k];
        for (int i = 0; i < z.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < z[i].length; j++) {
                if (max < z[i][j]) {
                    max = z[i][j];
                }
            }
            int sum = 0;
            if (max <= c) {
                sum = 1;
            }
            for (int j = 0; j < z[i].length; j++) {
                if (max > c) {
                    sum += z[i][j];
                } else {
                    sum *= z[i][j];
                }
            }
            b[i] = sum;
        }
        ArrayGenerator.displayArray(b);
    }
}
