package com.jfk.homework02;

//Check if number of points equals the sum of number of decimals and number of hundreds
public class Task_51 {
    public static void main(String[] args) {
        int number = 459;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        System.out.println(l == m + f);
    }
}
