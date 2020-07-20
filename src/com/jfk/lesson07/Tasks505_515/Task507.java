package com.jfk.lesson07.Tasks505_515;

import com.jfk.lesson06.ArrayGenerator;
import com.jfk.lesson07.MatrixGenerator;

public class Task507 {
    public static void main(String[] args) {
        int k = 5;
        int[][] z = MatrixGenerator.generateAsRandom(k, k);
        MatrixGenerator.display(z);
        System.out.println("------------------------------------");
        int[] b = new int[k];
        for (int i = 0; i < z.length; i++){
            b[i] = 0;
            boolean isNegative = false;
            for (int j = 0; j < z[i].length; j++) {
                if (z[i][j] < 0 && !isNegative) {
                    isNegative = true;
                    continue;
                }
                if (z[i][j] < 0) {
                    b[i] = 100;
                    break;
                } else {
                    b[i] += z[i][j];
                }
            }
            if (z[i][z[i].length - 1] < 0) {
                b[i] = 100;
            }
        }
        ArrayGenerator.displayArray(b);
    }
}
