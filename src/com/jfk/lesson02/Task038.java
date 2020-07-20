package com.jfk.lesson02;

import java.util.Arrays;

public class Task038 {
    public static void main(String[] args) {
        int a = 2;//7;
        int b = 4;//99;
        int c = 8;//134;
        int d = 16;//100;
        int[] array = {a, b, c, d};
        Arrays.sort(array);
        System.out.println(((array[1] * array[1]) == (array[2] * array[0])) && ((array[2] * array[2]) == (array[3] * array[1])));
    }
}
