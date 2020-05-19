package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_237 {
    public static void main(String[] args) {
//        int[] elements = ArrayElementGenerator.generateAsRandom(7);
//        ArrayElementGenerator.displayArray(elements);
        int[] elements = new int[]{0, 1, 3, 5, 0};
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
