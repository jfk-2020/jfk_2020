package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task395 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int[] y = new int[x.length - 1];
        int k = 0;
        boolean isClear = false;
        for (int i = 0; i < x.length; i++){
            if (x[i] % 2 == 0 && !isClear) {
                isClear = true;
                continue;
            }
            y[k++] = x[i];
        }
        ArrayGenerator.displayArray(y);
    }
}
