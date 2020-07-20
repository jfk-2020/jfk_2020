package com.jfk.lesson04.Tasks161_170;

public class Task165 {
    public static void main(String[] args) {
        int n = 81;
        int x = 1;
        boolean y = false;
        if (n == 1) {
            y = true;
        } else
            do {
                x = x * 3;
                System.out.println(x);
                if (n == x) {
                    y = true;
                }
            } while (n > x);
        System.out.println("n = " + n + "; y = " + y);
    }
}
