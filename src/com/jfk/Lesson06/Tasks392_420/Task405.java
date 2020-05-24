package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task405 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        for (int k = 0; k < 3; k++) {
            int max = x[ArrayGenerator.maxIdentifier(x)];
            System.out.println(max);
            for (int i = 0; i < x.length; i++) {
                if (x[i] == max) {
                    x[i] = Integer.MIN_VALUE;
                }
            }
        }
    }
}
