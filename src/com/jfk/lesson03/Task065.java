package com.jfk.lesson03;

public class Task065 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        if (numbers[0] * numbers[1] == 12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }
    }
}
