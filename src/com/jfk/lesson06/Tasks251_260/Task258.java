package com.jfk.lesson06.Tasks251_260;

import com.jfk.lesson06.ArrayGenerator;

public class Task258 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int maxIdentifier = ArrayGenerator.maxIdentifier(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == array[maxIdentifier]) {
                System.out.println(i);
                break;
            }
        }
    }
}
