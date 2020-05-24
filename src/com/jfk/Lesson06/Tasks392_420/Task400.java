package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task400 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int[] y = new int[x.length - 1];
        int count = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < x[i - 1]) {
                y[count++] = x[i];
            }
        }
        int[] result = ArrayGenerator.clearArray(y, count);
        System.out.println(count);
        ArrayGenerator.displayArray(result);
    }
}
