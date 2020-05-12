package com.jfk.homework02;

//Check if there are the same numbers in the three digit number
public class Task_52 {
    public static void main(String[] args) {
        int number = 373;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        if (f == m || f == l || m == l) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
