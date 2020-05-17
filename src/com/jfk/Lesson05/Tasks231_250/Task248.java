package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task248 {
    public static void main(String[] args) {
        int n = 15;
        int k = 9;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        int i = 0;
        for (int x:array) {
            if ((x + i) % k == 0) {
                sum += x;
            }
            i++;
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
