package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task327 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int min = X[ArrayGenerator.minIdentifier(X)];
        int count = 0;
        for (int x : X) {
            if (x == min) {
                count++;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for(int i = 0; i < X.length; i++){
            if (min == X[i]) {
                Y[j] = i;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
