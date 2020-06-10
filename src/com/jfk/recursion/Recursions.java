package com.jfk.recursion;

/**
 * @author William Arustamyan
 */

public class Recursions {


    public static void main(String[] args) {
        int[] array = {5, 10, 25, 15, 10};

        int max = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        int maxElement = getMaxElementFromArray(array, array[0], 0);
        System.out.println(maxElement);
    }

    public static int getMaxElementFromArray(int[] array, int max, int index) {
        if (index < array.length) {
            if (array[index] > max) {
                return getMaxElementFromArray(array, array[index], ++index);
            }
            return getMaxElementFromArray(array, max, ++index);
        }
        return max;
    }
}
