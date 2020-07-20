package com.jfk.lesson03;

public class Task066 {
    public static void main(String[] args) {
        int number = 7734;
        int[] numbers = Task051.getNumbers(number);
        if (numbers[0] == 4 || numbers[3] == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
