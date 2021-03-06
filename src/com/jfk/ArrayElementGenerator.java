package com.jfk;

import java.util.Random;

/**
 * @author William Arustamyan
 */

public class ArrayElementGenerator {

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

    public static char[] generateCharArray(int elementCount) {
        char[] array = new char[elementCount];
        for (int i = 0; i < array.length; i++) {
            if (random.nextInt(2) == 0) {
                array[i] = (char) (65 + random.nextInt(27));
            } else {
                array[i] = (char) (97 + random.nextInt(27));
            }
        }
        return array;
    }

    public static void displayArray(int[] array) {
        if (array == null) {
            System.out.println("empty array");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
}
