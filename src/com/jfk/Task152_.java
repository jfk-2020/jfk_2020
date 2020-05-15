package com.jfk;

public class Task152_ {
    public static void main(String[] args) {
        int n = 11;
        int d = 1;

        for (int i = n; i < 35; i ++) {
            if (i % n == 0) {
                d = d * i;
            }
        }
        System.out.println(d);
    }
}
