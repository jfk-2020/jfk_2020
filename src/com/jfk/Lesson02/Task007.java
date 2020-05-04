package com.jfk.Lesson02;

public class Task007 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = Math.pow(Math.pow(x*x + y*y, 5) + 4, 7);
        sum = sum + Math.sin(Math.cos(x + y));

        return sum;
    }
}
