package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task399 {
    public static void main(String[] args) {
        int n = 20;
        double[] x = ArrayGenerator.generateAsRandomDouble(n);
        Arrays.sort(x);
        ArrayGenerator.displayArray(x);
        int k = 0;
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i++){
            if (i == 0) {
                if (x[i] != x[i + 1]) {
                    y[k++] = x[i];
                }
            } else if (i == x.length - 1) {
                if (x[i] != x[i -1]) {
                    y[k++] = x[i];
                }
            } else {
                if (x[i -1] != x[i] && x[i] != x[i + 1]) {
                    y[k++] = x[i];
                }
            }
        }
        double[] result = ArrayGenerator.clearArray(y, k);
        ArrayGenerator.displayArray(result);
    }
}
