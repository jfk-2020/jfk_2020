package com.jfk.Lesson02;

public class Task006 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = Math.atan((3*x + 4) / (y*y + 4));
        sum = sum + Math.sqrt(Math.pow(x*x +3, 3));

        return sum;
    }
}
