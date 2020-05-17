package com.jfk.Lesson06.Tasks251_260;

import com.jfk.Lesson06.ArrayGenerator;

public class Task260 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int minIdentifier = ArrayGenerator.minIdentifier(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == array[minIdentifier]) {
                System.out.println(i);
                break;
            }
        }
    }
}
