package com.jfk.lesson03;

import java.util.Arrays;

public class Task060 {
    public static void main(String[] args) {
        int number = 423;
        int[] numbers = Task051.getNumbers(number);
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[numbers.length - 1 - i]);
        }
    }
}
