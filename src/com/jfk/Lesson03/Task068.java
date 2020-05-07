package com.jfk.Lesson03;

public class Task068 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        if (numbers[0] > numbers[1]) {
            System.out.println(numbers[0] * numbers[2]);
        } else {
            System.out.println(1);
        }
    }
}
