package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task231 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        for (int x:array) {
            if (x % 2 == 0) {
                sum += x*x;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
