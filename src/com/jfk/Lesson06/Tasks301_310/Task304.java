package com.jfk.Lesson06.Tasks301_310;

public class Task304 {
    public static void main(String[] args) {
        int n = 7899;
        int count = 0;
        for (int i = 9; i < Integer.MAX_VALUE; i++) {
            if (i % n == 2) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 10; i < Integer.MAX_VALUE; i++) {
            if (i % n == 2) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(array.length);
        //ArrayGenerator.displayArray(array);
    }
}
