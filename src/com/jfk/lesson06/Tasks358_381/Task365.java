package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task365 {
    public static void main(String[] args) {
        int n = 20;
        int[] a = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(a);
        int max = a[ArrayGenerator.maxIdentifier(a)];
        int min = a[ArrayGenerator.minIdentifier(a)];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                b[i] = min;
            } else {
                b[i] = max;
            }
        }
        ArrayGenerator.displayArray(b);
    }
}
