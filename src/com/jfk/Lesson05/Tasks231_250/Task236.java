package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task236 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 1;
        int count = 0;
        for (int x:array) {
            if (x % 2 == 1) {
                sum *= x;
                count++;
            }
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
        System.out.println(count);
    }
}
