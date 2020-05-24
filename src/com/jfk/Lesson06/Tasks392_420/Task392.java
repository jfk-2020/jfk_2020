package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task392 {
    public static void main(String[] args) {
        int n = 20;
        int[] t = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(t);
        for (int i = 0; i < t.length / 2; i++) {
            t[i] = t[i] + t[t.length - 1 - i];
            t[t.length - 1 - i] = t[i] - t[t.length - 1 - i];
            t[i] = t[i] - t[t.length - 1 - i];
        }
        ArrayGenerator.displayArray(t);
    }
}
