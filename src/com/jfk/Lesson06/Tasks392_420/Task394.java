package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task394 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int[] y = new int[x.length];
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i]) % 2 == 0) {
                y[k++] = x[i];
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i]) % 2 == 1) {
                y[k++] = x[i];
            }
        }
        ArrayGenerator.displayArray(y);
    }
}
