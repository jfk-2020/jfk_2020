package com.jfk.Homework03;

public class Task_170 {
    public static void main(String[] args) {
        int n = 16;
        boolean t = true;
        while (t) {
            n = n + 1;
            int k = n;
            while (k > 1) {
                if (k % 2 == 0) {
                    k = k / 2;
                } else {
                    break;
                }
                if (k == 1) {
                    t = false;
                }
            }
        }
        System.out.println(n);
    }
}

