package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_211 {

    public static void main(String[] args) {

        int[] elements = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(elements);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 0) {
                sum = sum + elements[i];
                count = count + 1;
            }
        }
        System.out.println((double) sum / count);
    }
}
