package com.jfk.Lesson04;

public class Task084 {
    public static void main(String[] args) {
        for (int xi = -64; xi <= 24; xi += 2) {
            double x = xi / 10.0;
            double y = Math.pow(Math.E, Math.atan(x));
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
