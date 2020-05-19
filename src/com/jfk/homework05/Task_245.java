package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_245 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(elements);

        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 3 == 0 && i % 3 == 0){
                sum += Math.pow(elements[i], 2);
            }
        }
        System.out.println(sum);
    }
}
