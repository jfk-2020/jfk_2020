package com.jfk.Lesson03;

public class Task057 {
    public static void main(String[] args) {
        int number = 423;
        int[] numbers = Task051.getNumbers(number);
        System.out.println(numbers[2]);
        if (number > 300) {
            System.out.println(1.0 * numbers[1] / numbers[0]);
        } else {
            System.out.println(1.0 * numbers[2] / numbers[0]);
        }
    }
}
