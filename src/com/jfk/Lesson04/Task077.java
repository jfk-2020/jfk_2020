package com.jfk.Lesson04;

public class Task077 {
    public static void main(String[] args) {
        for (int x = -8; x <= 8; x +=3) {
            double y = 0;
            if (x > 0) {
                y = Math.pow(x, 2) + 4 * Math.pow(x, 8);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
