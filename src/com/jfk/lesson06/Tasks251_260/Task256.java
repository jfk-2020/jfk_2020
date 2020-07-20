package com.jfk.lesson06.Tasks251_260;

import com.jfk.lesson06.ArrayGenerator;

public class Task256 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(array);
        int minIdentifier = ArrayGenerator.minIdentifier(array);
        System.out.println(minIdentifier + array[minIdentifier]);
    }
}
