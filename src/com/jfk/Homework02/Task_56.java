package com.jfk.Homework02;

//print subtraction result of the three digit number and the sum of its digits if the last digit is greater than the second.
public class Task_56 {
    public static void main(String[] args) {
        int number = 539;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        double sum = f + m + l;

        if (l > m) {
            System.out.println(sum / number);
        } else {
            System.out.println(number);
        }
    }
}
