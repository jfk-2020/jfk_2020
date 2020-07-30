package com.jfk.algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * @author William Arustamyan
 */


public class ONotation {

    public static void main(String[] args) {
        int[] array = {5, 2, 65, 8, 3, 6, 8, 9, 43, 2};
        int initialIndex = 0;
        int count = 0;
        while (initialIndex < array.length) {
            int max = array[0];
            int maxIndex = 0;
            for (int i = 0; i < array.length - initialIndex; i++) {
                if (array[i] >= max) {
                    max = array[i];
                    maxIndex = i;
                }
                count ++;
            }
            int tmp = array[array.length - 1 - initialIndex];
            array[array.length - 1 - initialIndex] = max;
            array[maxIndex] = tmp;
            initialIndex++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
