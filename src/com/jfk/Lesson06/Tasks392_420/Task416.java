package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task416 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        Arrays.sort(x);
        x[10] = 77;
        ArrayGenerator.displayArray(x);
        for (int i = 1; i < x.length; i++) {
            if (x[i] < x[i - 1]) {
                x[i] = x[i] + x[i - 1];
                x[i -1] = x[i] - x[i - 1];
                x[i] = x[i] - x[i - 1];
            }
        }
        ArrayGenerator.displayArray(x);
    }
}
