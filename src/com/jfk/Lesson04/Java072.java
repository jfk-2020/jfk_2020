package com.jfk.Lesson04;

public class Java072 {
    public static void main(String[] args) {
        for (double x = -5.4; x <= 1.4; x += 0.4) {
            double y = Math.pow(Math.atan(x*x), 2);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
