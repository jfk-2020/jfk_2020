package com.jfk.Lesson02;

import java.util.Arrays;

public class Task029 {
    public static void main(String[] args) {
        int a = 7;
        int b = 99;
        int c = 134;
        int[] array = {a, b, c};
        Arrays.sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
}
