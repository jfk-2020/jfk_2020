package com.jfk.Lesson06.Tasks251_260;

import com.jfk.Lesson06.ArrayGenerator;

public class Task254 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int min = array[ArrayGenerator.minIdentifier(array)];
        int max = array[ArrayGenerator.maxIdentifier(array)];
        System.out.println(min * max);
    }
}
