package com.jfk.Lesson04.Tasks071_080;

public class Task078 {
    public static void main(String[] args) {
        for (int x = 10; x <= 20; x += 2) {
            double y;
            if (x > 12) {
                y = 3 * Math.log(x) / Math.log(3);
            } else {
                y = x*x*x;
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
