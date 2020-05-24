package com.jfk.Lesson06.Tasks392_420;

import com.jfk.Lesson06.ArrayGenerator;

public class Task393 {
    public static void main(String[] args) {
        int n = 20;
        int[] x = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(x);
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print("0 ");
        }
    }
}
