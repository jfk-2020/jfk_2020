package com.jfk.Lesson04.Tasks071_080;

public class Task079 {
    public static void main(String[] args) {
        for (int x = -4; x <=5; x++){
            double y = -9;
            if (x > 1) {
                y = Math.log(x) / Math.log(4);
            }
            System.out.println("x = " + x + "; y = " + y);
        }
    }
}
