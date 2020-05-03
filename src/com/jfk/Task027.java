package com.jfk;

import java.util.Arrays;

public class Task027 {
    public static void main(String[] args) {
        int a = 7;
        int b = 11;
        int c = 9;
        int[] array = {a, b, c};
        Arrays.sort(array);
        System.out.println((array[2] - array[1]) == (array[1] - array[0]));
        int s = a + b + c;
        System.out.println(s == array[1] * 3);
    }
}
