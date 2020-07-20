package com.jfk.lesson06.Tasks251_260;

import com.jfk.lesson06.ArrayGenerator;

public class Task251 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        System.out.println(array[ArrayGenerator.maxIdentifier(array)]);
    }
}
