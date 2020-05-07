package com.jfk.Lesson03;

public class Task064 {
    public static void main(String[] args) {
        int number = 3214;
        int[] numbers = Task051.getNumbers(number);
        char y = (numbers[0] + numbers[1] == 5) ? 's' : 'd';
        System.out.println(y);
    }
}
