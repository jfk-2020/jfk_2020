package com.jfk.homework03;

public class Task_157 {
    public static void main(String[] args) {
        //print the sum of all the three digit numbers that % 5 !=0
        int sum = 0;

        for (int i = 100; i <= 999; i++) {
            if (i % 5 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}