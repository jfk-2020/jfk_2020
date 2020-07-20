package com.jfk.lesson02;

public class Task013 {
    public static void main(String[] args) {
        double x = 9;
        double a = 17;
        double b = 1;
        System.out.println(expression(x, a, b));
    }
    public static double expression(double x, double a, double b){
        double sum = 0;
        if (a + Math.abs(b) < 5) {
            sum = Math.pow(Math.E, Math.abs(a + x)) * Math.pow(Math.cos(a + x + b), 2);
        } else if (a + Math.abs(b) > 2) {
            sum = Math.pow(Math.atan(a + x), 1.0/3);
        } else {
            sum = a + Math.abs(b);
        }

        return sum;
    }
}
