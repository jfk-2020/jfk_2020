package com.jfk.lesson04.Tasks161_170;

public class Task156_ {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum *= i;
            }
        }
        System.out.println(sum);
    }
}
