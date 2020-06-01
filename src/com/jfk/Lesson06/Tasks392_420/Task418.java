package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task418 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int count = 0;
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j] & x[j] != Integer.MAX_VALUE) {
                    x[j] = Integer.MAX_VALUE;
                    count++;
                }
            }
        }
        int[] y = new int[N - count];
        int k = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == Integer.MAX_VALUE) {
                continue;
            }
            y[k++] = x[i];
        }
        ArrayGenerator.displayArray(y);
    }
}