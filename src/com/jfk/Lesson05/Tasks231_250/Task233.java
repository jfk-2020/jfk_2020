package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.ArrayGenerator;

public class Task233 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sumE = 0;
        int sumP = 1;
        for (int x:array) {
            if (x % 2 == 0) {
                sumE += x;
                sumP *= x;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sumE);
        System.out.println(sumP);
    }
}
