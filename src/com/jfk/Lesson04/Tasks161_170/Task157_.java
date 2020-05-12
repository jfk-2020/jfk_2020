package com.jfk.Lesson04.Tasks161_170;

public class Task157_ {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 100; i < 1000; i++) {
            if (i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
