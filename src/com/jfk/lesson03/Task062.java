package com.jfk.lesson03;

public class Task062 {
    public static void main(String[] args) {
        int number = 2232;//456078;
        int[] numbers = Task051.getNumbers(number);
        if (number > 5000) {
            System.out.println(1.0 * number / (numbers[0] + numbers[2]));
        } else {
            System.out.println(1.0 * number / (numbers[1] + numbers[3]));
        }
    }
}
