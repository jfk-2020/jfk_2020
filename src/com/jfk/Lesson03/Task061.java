package com.jfk.Lesson03;

public class Task061 {
    public static void main(String[] args) {
        int number = 2232;//456078;
        int[] numbers = Task051.getNumbers(number);
        boolean t = (numbers[0] + numbers[1]) == (numbers[2] + numbers[3]);
        System.out.println(t);
    }
}
