package com.jfk.lesson04.Tasks161_170;

public class Task158_ {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 100; i < 1000; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum *= i;
            }
        }
        System.out.println(sum);
    }
}
