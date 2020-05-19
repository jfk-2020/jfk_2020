package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task322 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = X.length;
        for (int x : X) {
            if (x == 0) {
                count += 2;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for (int x : X) {
            Y[j] = x;
            if (x == 0) {
                j++;
                Y[j] = 0;
                j++;
                Y[j] = 0;
            }
            j++;
        }
        ArrayGenerator.displayArray(Y);
    }
}
