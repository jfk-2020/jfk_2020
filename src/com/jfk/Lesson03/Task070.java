package com.jfk.Lesson03;

public class Task070 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        int y = (numbers[0] * numbers[1] * numbers[2] * numbers[3] > 200) ? 0 : 1;
        System.out.println(y);
    }
}
