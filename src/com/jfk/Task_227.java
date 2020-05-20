package com.jfk;

public class Task_227 {
    public static void main(String[] args) {
        int k = 8;
        int sum = 0;
        int count = 0;

        int[] array = new int[]{16, 36, 40, 78};

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
