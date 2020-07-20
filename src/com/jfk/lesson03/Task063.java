package com.jfk.lesson03;

public class Task063 {
    public static void main(String[] args) {
        int number = 2231;
        int[] numbers = Task051.getNumbers(number);
        if (numbers[0] == 1 || numbers[1] == 1 || numbers[2] == 1 || numbers[3] == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
