package com.jfk.Lesson05.Tasks231_250;

import com.jfk.Lesson06.Tasks281_290.ArrayGenerator;

public class Task239 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        int count = 0;
        for (int x:array) {
            if (x % 5 == 0) {
                sum += x*x;
                count++;
            }
        }
        ArrayGenerator.displayArray(array);
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}
