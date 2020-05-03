package com.jfk;

import java.util.Arrays;
import java.util.Collections;

public class Task030 {
    public static void main(String[] args) {
        int a = 7;
        int b = 99;
        int c = 134;
        int[] array = {a, b, c};
        Arrays.sort(array);
        int length = array.length;
        for (int i = 0; i < length; i++){
            System.out.println(array[length - 1 - i]);
        }
    }
}
