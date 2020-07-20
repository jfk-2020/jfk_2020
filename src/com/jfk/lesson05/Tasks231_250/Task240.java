package com.jfk.lesson05.Tasks231_250;

import com.jfk.lesson06.ArrayGenerator;

public class Task240 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int count = 0;
        for (int x:array) {
            if (x % 7 == 0) {
                count++;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(count);
    }
}
