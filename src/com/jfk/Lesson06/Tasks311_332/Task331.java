package com.jfk.Lesson06.Tasks311_332;

import com.jfk.Lesson06.ArrayGenerator;

public class Task331 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int count = 0;
        for(int x : X){
            if (Math.sqrt(x) % 1 == 0 && x != 0) {
                count++;
            }
        }
        int[] Y = new int[count];
        int j = 0;
        for(int x : X){
            if (Math.sqrt(x) % 1 == 0 && x != 0) {
                Y[j] = x;
                j++;
            }
        }
        ArrayGenerator.displayArray(Y);
    }
}
