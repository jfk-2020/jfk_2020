package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task417 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int minIdentifier = ArrayGenerator.maxIdentifier(x);
        for (int i = minIdentifier; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }
        int[] y = ArrayGenerator.clearArray(x, N - 1);
        ArrayGenerator.displayArray(y);
    }
}
