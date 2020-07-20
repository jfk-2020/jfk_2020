package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task402 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int b = -10;
        int c = 55;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= b && x[i] <= c) {
                if (max < x[i]) {
                    max = x[i];
                }
            }
        }
        System.out.println(max);
    }
}
