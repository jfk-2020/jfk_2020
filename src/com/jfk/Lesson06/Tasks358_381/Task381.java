package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task381 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    x[j] = x[j] + x[j + 1];
                    x[j + 1] = x[j] - x[j + 1];
                    x[j] = x[j] - x[j + 1];
                }
            }
        }
        ArrayGenerator.displayArray(x);
    }
}
