package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task379 {
    public static void main(String[] args) {
        int n = 100;
        int[] x = new int[n];
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            if (Task374.isNumberSimple(i)) {
                x[k++] = i;
            }
        }
        int[] y = new int[k];
        for (int i = 0; i < k; i++) {
            y[i] = x[i];
        }
        ArrayGenerator.displayArray(y);
    }
}
