package com.jfk.Lesson04.Tasks161_170;

public class Task152_ {
    public static void main(String[] args) {
        int n = 50;
        long sum = 1;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                sum *= i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
