package com.jfk.lesson02;

import java.util.Arrays;

public class Task037 {
    public static void main(String[] args) {
        int a = 1;//7;
        int b = 5;//99;
        int c = 9;//134;
        int d = 13;//100;
        int[] array = {a, b, c, d};
        Arrays.sort(array);
        System.out.println(((array[1] - array[0]) == (array[2] - array[1])) && ((array[2] - array[1]) == (array[3] - array[2])));
    }
}
