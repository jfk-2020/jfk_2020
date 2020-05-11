package com.jfk.Lesson04;

public class Task081 {
    public static void main(String[] args) {
        for (int xi = -75; xi <= 83; xi += 3) {
            double x = xi / 10.0;
            double y = Math.log(x*x + 4) / Math.log(3);
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
