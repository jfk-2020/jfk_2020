package com.jfk.lesson06.Tasks301_310;

public class Task305 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 1000; i < 10000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(count);
        //ArrayGenerator.displayArray(array);
    }
}
