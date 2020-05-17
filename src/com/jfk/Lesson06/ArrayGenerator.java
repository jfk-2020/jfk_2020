package com.jfk.Lesson06;

import java.util.Random;

public class ArrayGenerator {
    private static final Random random = new Random();

    public static int[] generateAsRandom(int elementCount) {
        int[] array = new int[elementCount];
        for (int i = 0; i < array.length; i++) {
            if (random.nextInt(2) == 0) {
                array[i] = -1 * random.nextInt(100);
            } else {
                array[i] = random.nextInt(100);
            }
        }
        return array;
    }

    public static char[] generateAsRandomChar(int elementCount) {
        char[] array = new char[elementCount];
        for (int i = 0; i < array.length; i++) {
            if (random.nextInt(2) == 0) {
                array[i] = (char)('a' + random.nextInt(27));
            } else {
                array[i] = (char)('A' + random.nextInt(27));
            }
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void displayArrayChar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static int minIdentifier(int[] array){
        int identifier = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }
    public static int maxIdentifier(int[] array){
        int identifier = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > min) {
                identifier = i;
                min = array[i];
            }
        }
        return identifier;
    }
}