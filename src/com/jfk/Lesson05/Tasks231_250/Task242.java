package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task242 {
    public static void main(String[] args) {
        int n = 15;
        int m = 6;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 1;
        for (int x:array) {
            if (x % m == 0) {
                sum *= x;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
