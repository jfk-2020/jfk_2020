package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task404 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int min = x[ArrayGenerator.minIdentifier(x)];
        int count = 0;
        for (int xx : x) {
            if (min == xx) {
                count++;
            }
        }
        System.out.println(count);
    }
}
