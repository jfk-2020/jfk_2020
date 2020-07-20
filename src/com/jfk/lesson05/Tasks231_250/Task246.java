package com.jfk.lesson05.Tasks231_250;

import com.jfk.lesson06.ArrayGenerator;

public class Task246 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = ArrayGenerator.generateAsRandom(n);
        int sum = 0;
        int i = 0;
        int count = 0;
        for (int x:array) {
            if (Math.sqrt(x) % 1 == 0) {
                sum += x;
                count++;
            }
            i++;
        }
        ArrayGenerator.displayArray(array);
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}
