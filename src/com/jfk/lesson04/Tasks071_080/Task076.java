package com.jfk.lesson04.Tasks071_080;

public class Task076 {
    public static void main(String[] args) {
        for (int x = -5; x <=5; x +=2) {
            double y = 0;
            if (x > 0) {
                y = Math.pow(x, 2) + 4 * Math.pow(x, 8);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
