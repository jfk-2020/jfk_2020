package com.jfk.secondHomework;

public class Task_58 {
    public static void main(String[] args) {
        int number = 281;

        int m = (number % 100) / 10;
        int l = number % 10;

        char c;
        if (m + l < 5) {
            c = 'a';
        } else {
            c = 'b';
        }
        System.out.println(c);
    }
}
