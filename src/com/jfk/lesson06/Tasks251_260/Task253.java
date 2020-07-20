package com.jfk.lesson06.Tasks251_260;

import com.jfk.lesson06.ArrayGenerator;

public class Task253 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int min = array[ArrayGenerator.minIdentifier(array)];
        int max = array[ArrayGenerator.maxIdentifier(array)];
        System.out.println(min + max);
    }
}
