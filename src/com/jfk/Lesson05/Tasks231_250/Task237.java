package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.ArrayGenerator;

public class Task237 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int count = 0;
        for (int x:array) {
            if (x == 0) {
                count++;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(count);
    }
}
