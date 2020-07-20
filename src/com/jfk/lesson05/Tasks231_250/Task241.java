package com.jfk.lesson05.Tasks231_250;

import com.jfk.lesson06.ArrayGenerator;

public class Task241 {
    public static void main(String[] args) {
        int n = 15;
        int k = 6;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        for (int x:array) {
            if (x % k == 0) {
                sum += x;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
