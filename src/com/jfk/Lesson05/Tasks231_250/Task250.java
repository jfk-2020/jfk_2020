package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.ArrayGenerator;

public class Task250 {
    public static void main(String[] args) {
        int n = 15;
        int k = 9;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 1;
        int i = 0;
        for (int x:array) {
            if (x * i % 3 == 2) {
                sum *= x;
            }
            i++;
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
