package com.jfk.lesson03;

public class Task069 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        int y = (numbers[0] + numbers[1] + numbers[2] + numbers[3] > 20) ? 1 : 0;
        System.out.println(y);
    }
}
