package com.jfk.lesson02;

import java.util.Arrays;

public class Task035 {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int c = 7;
        int d = 1;
        int[] array = {a, b, c, d};
        Arrays.sort(array);;
        System.out.println(array[3] == array[0] + array[1] + array[2]);
    }
}
