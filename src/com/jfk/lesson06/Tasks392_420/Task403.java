package com.jfk.lesson06.Tasks392_420;

import com.jfk.lesson06.ArrayGenerator;

public class Task403 {
    public static void main(String[] args) {
        int N = 20;
        int[] x = ArrayGenerator.generateAsRandom(N);
        ArrayGenerator.displayArray(x);
        int min = x[ArrayGenerator.minIdentifier(x)];
        int sum = 0;
        boolean isFirst = false;
        boolean isLast = false;
        for (int i = 0; i < x.length; i++){
            if (min == x[i]) {
                if (!isFirst) {
                    isFirst = true;
                } else if (!isLast) {
                    isLast = true;
                    break;
                }
            } else {
                if (isFirst && !isLast) {
                    sum += x[i];
                }
            }
        }
        if (!isLast) {
            System.out.println(min);
        } else {
            System.out.println(sum);
        }
    }
}
