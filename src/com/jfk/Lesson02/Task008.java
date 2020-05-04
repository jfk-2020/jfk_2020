package com.jfk.Lesson02;

public class Task008 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = Math.pow(x*x + Math.pow(y*y + 4, 1.0/3) + 4, 1.0/4);
        sum = sum + Math.pow(Math.abs(x) + Math.abs(y), 10);

        return sum;
    }
}
