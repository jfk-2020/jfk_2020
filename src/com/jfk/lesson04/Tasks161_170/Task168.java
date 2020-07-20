package com.jfk.lesson04.Tasks161_170;

public class Task168 {
    public static void main(String[] args) {
        boolean p = false;
        int n = 77;
        for (int i = 2; i < n/2 + 1; i++) {
            if (n % i == 0) {
                p = true;
                break;
            }
        }
        System.out.println(p);
    }
}
