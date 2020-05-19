package com.jfk.homework05;

import com.jfk.ArrayElementGenerator;

public class Task_246 {
    public static void main(String[] args) {
        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < elements.length; i++) {
            double square = Math.sqrt(elements[i]);

            if (((square - Math.floor(square)) == 0)) {
                sum += elements[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}

