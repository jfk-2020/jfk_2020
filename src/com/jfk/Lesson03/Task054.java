package com.jfk.Lesson03;

import java.util.Arrays;

public class Task054 {
    public static void main(String[] args) {
        int number = 123;
        int[] numbers = Task051.getNumbers(number);
        Arrays.sort(numbers);
        System.out.println(numbers[2]);
    }
}
