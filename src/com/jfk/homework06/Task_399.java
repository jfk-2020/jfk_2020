package com.jfk.homework06;

public class Task_399 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 4, 5, 7, 8, 8, 9, 9};

        for (int i = 0; i < array.length; i++) {
            if (areEqualElements(i, array) == 1) {
                System.out.println(array[i] + " ");
            }
        }
    }

    static int areEqualElements(int k, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[k]) {
                count++;
            }
        }
        return count;
    }
}
