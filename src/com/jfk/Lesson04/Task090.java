package com.jfk.Lesson04;

public class Task090 {
    public static void main(String[] args) {
        for (int xi = -300; xi <= 300; xi += 35) {
            double x = xi / 10.0;
            double y;
            if (x > 5) {
                y = Math.sin(x);
            } else {
                y = Math.cos(x);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
