package com.jfk.thirdHomework;

public class Task_201 {
    public static void main(String[] args) {
        int n = 23775658;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
