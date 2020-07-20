package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task397 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        Arrays.sort(x);
        ArrayGenerator.displayArray(x);
        int[] y = ArrayGenerator.generateAsRandom(n);
        Arrays.sort(y);
        ArrayGenerator.displayArray(y);
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
            z[i + x.length] = y[i];
        }
        Arrays.sort(z);
        ArrayGenerator.displayArray(z);
    }
}
