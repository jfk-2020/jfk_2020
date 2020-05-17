package com.jfk.Lesson06.Tasks261_270;

import com.jfk.Lesson06.ArrayGenerator;

public class Task264 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(Y);
        int count = 0;
        for (int i = 0; i < X.length; i++){
            if (X[i] < 0) {
                count++;
            }
            if (Y[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
