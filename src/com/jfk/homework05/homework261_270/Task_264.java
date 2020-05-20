package com.jfk.homework05.homework261_270;

import com.jfk.ArrayElementGenerator;

public class Task_264 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int count = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
