package com.jfk.secondHomework;

public class Task_57 {
    public static void main(String[] args) {
        int number = 231;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        int subtraction1 = m - l;
        int subtraction2 = f - l;
        int givenNumber = 300;
        if (number > givenNumber) {
            System.out.println(subtraction1);
        } else {
            System.out.println(subtraction2);
        }
    }
}
