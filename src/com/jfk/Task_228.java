package com.jfk;

public class Task_228 {
    public static void main(String[] args) {
        int k = 5;
        int sum = 0;

        int[] array = new int[]{10, 20, 9, 4};

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
