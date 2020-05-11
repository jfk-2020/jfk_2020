package com.jfk.Lesson04.Tasks071_080;

public class Task080 {
    public static void main(String[] args) {
        for (int x = -5; x <= 5; x += 2) {
            double y;
//            if (x > 5) {
//                y = Math.pow(2, 5 - x);
//            } else {
//                y = 7 - x;
//            }
            y = 7 - x;
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
