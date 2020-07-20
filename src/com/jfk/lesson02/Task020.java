package com.jfk.lesson02;

public class Task020 {
    public static void main(String[] args) {
        double x = 3;
        double a = 17;
        double b = 1;
        double c = 5;
        System.out.println(expression(x, a, b));
    }
    public static double expression(double x, double a, double b){
        double sum = 0;
        if (a < 3) {
            sum = Math.pow(Math.E, Math.cos(x + a + b)) * Math.tan(a + b*b);
        } else {
            sum = Math.log(4 + a*a + b*b) / Math.log(2);
        }

        return sum;
    }
}
