package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task396 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int k = 0;
        boolean isClear = false;
        int[] y = new int[x.length + 1];
        for (int i = 0; i < x.length; i++) {
            if (!isClear && x[i] < 0) {
                isClear = true;
                y[k++] = x[i];
                y[k++] = 0;
                continue;
            }
            y[k++] = x[i];
        }
        ArrayGenerator.displayArray(y);
    }
}
