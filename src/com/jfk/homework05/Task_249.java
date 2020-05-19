package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_249 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        int count = 0;
        int sub = 0;
        int k = 10;

        for (int i = 0; i < elements.length; i++) {
            sub = elements[i] - i;
            if (sub > k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
