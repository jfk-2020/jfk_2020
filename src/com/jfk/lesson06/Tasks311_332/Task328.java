package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task328 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            boolean itOne = true;
            for (int j = 0; j < X.length; j++) {
                if (i == j) {
                    continue;
                } else if (X[i] == X[j]) {
                    itOne = false;
                }
            }
            count = count + (itOne ? 1 : 0);
        }
        int[] Y = new int[count];
        int k = 0;
        for(int i = 0; i < X.length; i++){
            boolean itOne = true;
            for (int j = 0; j < X.length; j++) {
                if (i == j) {
                    continue;
                } else if (X[i] == X[j]) {
                    itOne = false;
                }
            }
            if (itOne) {
                Y[k] = X[i];
                k++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
