package com.jfk.Lesson06.Tasks251_260;

import com.jfk.Lesson06.ArrayGenerator;

public class Task259 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int minIdentifier = ArrayGenerator.minIdentifier(array);
        System.out.println(minIdentifier);
    }
}