package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

public class Task380 {
    public static void main(String[] args) {
        int m = 10;
        int[] X = ArrayGenerator.generateAsRandom(m);
        int[] Y = ArrayGenerator.generateAsRandom(m);
        boolean isTrue = true;
        for (int i = 0; i < X.length; i++) {
            int element = X[i];
            boolean isTrueInArray = false;
            for (int j = 0; j < Y.length; j++) {
                if (Y[j] == element) {
                    isTrueInArray = true;
                }
            }
            if (!isTrueInArray) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            int sum = X[ArrayGenerator.maxIdentifier(X)] + Y[ArrayGenerator.maxIdentifier(X)];
            sum /= 2;
            System.out.println(sum);
        } else {
            int sum = X[ArrayGenerator.minIdentifier(X)] + Y[ArrayGenerator.minIdentifier(X)];
            sum /= 2;
            System.out.println(sum);
        }
    }
}
