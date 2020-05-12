package com.jfk.Lesson04.Tasks121_130;

public class Task127 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <= 17; i++){
            double x = 0;
            double y = 0;
            if (i % 2 == 1) {
                x = Math.pow(Math.sin(i), 2);
                y = Math.tan(i);
            } else {
                x = 0;
                y = Math.atan(i);
            }
            System.out.println("x = " + x + "; y = " + y);
            sum *= (x * y * y);
        }
        System.out.println(sum);
    }
}
