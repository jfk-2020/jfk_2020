package com.jfk.Lesson03;

public class Task056 {
    public static void main(String[] args) {
        int number = 423;
        int[] numbers = Task051.getNumbers(number);
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        if (numbers[0] > numbers[1]) {
            System.out.println(1.0 * sum / number);
        } else {
            System.out.println(number);
        }
    }
}
