package com.jfk.Lesson04;

public class Task166 {
    public static void main(String[] args) {
        int n = 64;
        int x = 1;
        int y = 0;
        if (n == 1) {
            y = 1;
        } else
            do {
                x = x * 4;
                System.out.println(x);
                if (n == x) {
                    y = 1;
                }
            } while (n > x);
        System.out.println("n = " + n + "; y = " + y);
     }
}
