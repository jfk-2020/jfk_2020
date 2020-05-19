package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_243 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int count = 0;
        int t = 3;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % t == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
