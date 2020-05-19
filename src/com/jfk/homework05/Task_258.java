package com.jfk.homework05;

public class Task_258 {
    public static void main(String[] args) {
        int[] elements = new int[]{1,3,5,7,8,3,8};

        int max = elements[0];
        int index = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] >= max) {
                max = elements[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}


