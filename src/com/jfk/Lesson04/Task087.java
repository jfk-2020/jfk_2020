package com.jfk.Lesson04;

public class Task087 {
    public static void main(String[] args) {
        for (int xi = 100; xi <= 230; xi += 32) {
            double x = xi / 10.0;
            double y = 0;
            if (x > 7) {
                y = Math.pow(Math.E, Math.sin(x));
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
