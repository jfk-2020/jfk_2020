package com.jfk.lesson04.Tasks161_170;

public class Task164 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 100; i < 1000; i++) {
            if (n*n < i) {
                System.out.println(i);
                break;
            }
        }
        if (n*n < 1000 && n*n >= 100) {
            System.out.println(n*n + 1);
        }
    }
}
