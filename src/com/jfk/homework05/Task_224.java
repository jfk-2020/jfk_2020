package com.jfk.homework05;

public class Task_224 {
    public static void main(String[] args) {
        int k = 7;
        int sum = 0;

        int[] array = new int[3];
        array[0] = 4;
        array[1] = 9;
        array[2] = 3;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
