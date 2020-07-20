package com.jfk.lesson04.Tasks161_170;

public class Task170 {
    public static void main(String[] args) {
        int n = 666;
        for (int i = 1; i < n; i++) {
            if (Math.pow(2, i) > n) {
                System.out.println(Math.pow(2, i) );
                break;
            }
        }
    }
}
