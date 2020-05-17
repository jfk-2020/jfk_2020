package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.ArrayGenerator;

public class Task245 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        int i = 0;
        for (int x:array) {
            if ((x + i) % 3 == 0) {
                sum += x*x;
            }
            i++;
        }
        ArrayGenerator.displayArray(array);
        System.out.println(sum);
    }
}
