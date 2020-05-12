package com.jfk.Homework03;

public class Task_155 {
    public static void main(String[] args) {
//print the sum of all the two digit numbers that % 3 == 0
        int sum = 0;

        for (int i = 12; i <= 99; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
