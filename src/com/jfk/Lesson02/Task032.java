package com.jfk.Lesson02;

import java.util.Arrays;

public class Task032 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int c = 9999;
        int d = 0;
        int[] array = {a, b, c, d};
        Arrays.sort(array);;
        System.out.println(array[0]);
    }
}
