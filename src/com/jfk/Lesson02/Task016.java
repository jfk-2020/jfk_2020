package com.jfk.Lesson02;

public class Task016 {
    public static void main(String[] args) {
        double x = 3;
        double a = 17;
        System.out.println(expression(x, a));
    }
    public static double expression(double x, double a){
        double sum = 0;
        if (Math.abs(a) < 3) {
            sum = Math.pow(Math.sin(Math.abs(a + x)), 2) + Math.pow(Math.cos(x*x), 2);
        } else {
            sum = Math.pow(a*a + x*x, 1.0/4) * Math.log(a*a + Math.pow(x, 4)) / Math.log(2);
        }

        return sum;
    }
}
