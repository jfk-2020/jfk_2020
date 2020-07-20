package com.jfk.lesson03;

public class Task058 {
    public static void main(String[] args) {
        int number = 423;
        int[] numbers = Task051.getNumbers(number);
        char f = 'b';
        if (numbers[1] + numbers[2] < 5) {
            f = 'a';
        }
        System.out.println(f);
    }
}
