package com.jfk.homework05;

public class Task_227 {
    public static void main(String[] args) {
        int k = 3;
        int sum = 0;
        int count = 0;

        int[] array = new int[]{3, 9, 12, 23};

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}