package com.jfk.lesson02;

import java.util.Arrays;

public class Task039 {
    public static void main(String[] args) {
        int a = 7;
        int b = 99;
        int c = 134;
        int d = 100;
        int[] array = {a, b, c, d};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}