package com.jfk.Lesson06.Tasks382_391;

import com.jfk.Lesson06.ArrayGenerator;

public class Task388 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int min = Y[ArrayGenerator.minIdentifier(Y)];
        System.out.println(min);
        int k = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (X[i] < min) {
                result[k++] = X[i];
            }
        }
        int[] clearResult = ArrayGenerator.clearArray(result, k);
        ArrayGenerator.displayArray(clearResult);
    }
}
