package com.jfk.lesson06.Tasks382_391;

import com.jfk.lesson06.ArrayGenerator;

public class Task384 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < X.length; i++) {
            if (ArrayGenerator.countOfExists(Y, X[i]) == 1) {
                result[k++] = X[i];
            }
        }
        int[] clearResult = ArrayGenerator.clearArray(result, k);
        ArrayGenerator.displayArray(clearResult);
    }
}
