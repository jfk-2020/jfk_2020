package com.jfk.lesson03;

public class Task053 {
    public static void main(String[] args) {
        int number = 123;
        int k = 111;
        int[] numbers = Task051.getNumbers(number);
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        if (number > k) {
            System.out.println(1.0 * number / sum);
        } else {
            System.out.println(1.0 * sum / number);
        }
    }
}
