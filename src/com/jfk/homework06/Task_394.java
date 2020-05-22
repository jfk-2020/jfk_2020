package com.jfk.homework06;

import com.jfk.ArrayElementGenerator;

public class Task_394 {
    public static void main(String[] args) {
        int[] x = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(x);

        int[] y = new int[x.length];
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                y[z] = x[i];
                z++;
            }
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                y[z] = x[i];
                z++;
            }
        }

        ArrayElementGenerator.displayArray(y);
    }
}
