package com.jfk.lesson02;

import java.util.Arrays;

public class Task028 {
    public static void main(String[] args) {
        double a = 2;
        double b = 8;
        double c = 32;
        double[] array = {a, b, c};
        Arrays.sort(array);
        System.out.println(array[2]/array[1] == array[1]/array[0]);
        System.out.println(array[2] * array[0] == array[1] * array[1]);
    }
}
