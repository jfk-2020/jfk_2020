package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task330 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = new int[X.length];
        int j = 0;
        for(int x : X){
            if (x % 2 == 0) {
                Y[j] = x;
                j++;
            }
        }
        for(int x : X){
            if (!(x % 2 == 0)) {
                Y[j] = x;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
