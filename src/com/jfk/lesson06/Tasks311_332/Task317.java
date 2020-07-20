package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task317 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        int max = 0;
        for (int x : X) {
            if (x < 0) {
                count++;
            } else if (max < x) {
                max = x;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for (int x : X) {
            if (x < 0) {
                Y[j] = x + max;
                j++;
            }
        }
        System.out.println(max);
        ArrayGenerator.displayArray(Y);
    }
}
