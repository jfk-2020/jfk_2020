package com.jfk.Lesson04.Tasks161_170;

public class Task159_ {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 100; i < 1000; i++) {
            if (i % 3 == 1 && i % 4 == 2) {
                sum *= i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
