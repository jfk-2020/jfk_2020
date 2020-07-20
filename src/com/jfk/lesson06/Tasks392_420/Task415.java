package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

import java.util.Arrays;

public class Task415 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        Arrays.sort(x);
        x[0] = 16;
        ArrayGenerator.displayArray(x);
        int element = x[0];
        int k = -1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] > x[0] && x[i - 1] < x[0]) {
                k = i;
                break;
            }
        }
        for (int i = 0; i < k - 1; i++) {
            x[i] = x[i + 1];
        }
        x[k - 1] = element;
        ArrayGenerator.displayArray(x);
    }
}
