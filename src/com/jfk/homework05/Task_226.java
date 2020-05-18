package com.jfk.homework05;

public class Task_226 {
    public static void main(String[] args) {
        int k = 15;
        int count = 0;

        int[] array = new int[4];
        array[0] = 30;
        array[1] = 25;
        array[2] = 10;
        array[3] = 3;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                count++;
            }
        }
        System.out.println(count);

    }
}
