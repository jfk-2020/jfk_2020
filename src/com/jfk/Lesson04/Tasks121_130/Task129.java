package com.jfk.Lesson04.Tasks121_130;

public class Task129 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 16; i++){
            double x = 0;
            double y = 0;
            if (Math.pow(i, 0.5) % 1 == 0) {
                x = Math.tan(i);
            } else {
                x = Math.atan(i);
            }
            y = Math.pow(Math.E, i - 4);
            System.out.println("x = " + x + "; y = " + y);
            sum += (x * y - 1);
        }
        System.out.println(sum);
    }
}
