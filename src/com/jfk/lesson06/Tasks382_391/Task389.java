package com.jfk.lesson06.Tasks382_391;

import com.jfk.lesson06.ArrayGenerator;

public class Task389 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < Y.length; i++) {
            if (i % 2 == 1) {
                sum += Y[i];
                count++;
            }
        }
        sum = sum / count;
        System.out.println(sum);
        int k = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (Math.abs(X[i]) > sum) {
                result[k++] = X[i];
            }
        }
        int[] clearResult = ArrayGenerator.clearArray(result, k);
        ArrayGenerator.displayArray(clearResult);
    }
}
