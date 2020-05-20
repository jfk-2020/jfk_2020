package com.jfk;

public class Task_226 {
    public static void main(String[] args) {
        int k = 10;
        int count = 0;

        int[] array = new int[]{20, 5, 40, 4};

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
