package com.jfk.lesson07.Tasks505_515;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task505 {
    public static void main(String[] args) {
        int k = 5;
        int[][] z = MatrixGenerator.generateAsRandom(k, k);
        MatrixGenerator.display(z);
        System.out.println("------------------------------------");
        int[] b = new int[k];
        for (int i = 0; i < z.length; i++) {
            int max = Integer.MIN_VALUE;
            int jMax = 0;
            for (int j = 0; j < z[i].length; j++) {
                if (max < z[i][j]) {
                    max = z[i][j];
                    jMax = j;
                }
            }
            int sum = 1;
            for (int j = 0; j < jMax; j++) {
                sum *= z[i][j];
            }
            b[i] = sum;
        }
        ArrayGenerator.displayArray(b);
    }
}
