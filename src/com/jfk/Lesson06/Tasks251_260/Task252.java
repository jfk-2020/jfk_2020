package com.jfk.Lesson06.Tasks251_260;

import com.jfk.Lesson06.ArrayGenerator;

public class Task252 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        System.out.println(array[ArrayGenerator.minIdentifier(array)]);
    }
}
