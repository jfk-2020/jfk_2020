package com.jfk.Lesson03;

public class Task052 {
    public static void main(String[] args) {
        int number = 123;
        int[] numbers = Task051.getNumbers(number);
        if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
