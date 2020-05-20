package com.jfk;

public class Task_225 {
    public static void main(String[] args) {
        int t = 8;
        int product = 1;

        int[] array = new int[]{1, 2, 3, 10};

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < t) {
                product *= array[i];
            }
        }
        System.out.println(product);
    }
}
