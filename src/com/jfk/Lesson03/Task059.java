package com.jfk.Lesson03;

import java.util.Arrays;

public class Task059 {
    public static void main(String[] args) {
        int number = 423;
        int[] numbers = Task051.getNumbers(number);
        Arrays.sort(numbers);
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
