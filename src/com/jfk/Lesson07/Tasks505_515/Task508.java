package com.jfk.Lesson07.Tasks505_515;

import com.jfk.Lesson06.ArrayGenerator;
import com.jfk.Lesson07.MatrixGenerator;

public class Task508 {
    public static void main(String[] args) {
        int k = 5;
        int[][] z = MatrixGenerator.generateAsRandom(k, k);
        MatrixGenerator.display(z);
        System.out.println("------------------------------------");
        int[] b = new int[k];
        for (int i = 0; i < z.length; i++) {
            int iMax = 0;
            int iMin = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < z[i].length; j++) {
                if (max < z[i][j]) {
                    max = z[i][j];
                    iMax = j;
                }
                if (min > z[i][j]) {
                    min = z[i][j];
                    iMin = j;
                }
            }
            int k1 = iMin;
            int k2 = iMax;
            if (iMin > iMax) {
                k1 = iMax;
                k2 = iMin;
            }
            int count = 0;
            int sum = 0;
            for (int j = k1 + 1; j < k2; j++) {
                sum += z[i][j] * z[i][j];
                count++;
            }
            if (count == 0) {
                b[i] = 0;
            } else {
                b[i] = sum / count;
            }
        }
        ArrayGenerator.displayArray(b);
    }
}
