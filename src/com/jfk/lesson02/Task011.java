package com.jfk.lesson02;

public class Task011 {
    public static void main(String[] args) {
        double x = 9;
        double a = 17;
        double b = 1;
        System.out.println(expression(x, a, b));
    }
    public static double expression(double x, double a, double b){
        double sum = 0;
        if (a*a + b*b > 5) {
            sum = 3*Math.pow(Math.E, a - x) + Math.log(a*a + b*b + 5) / Math.log(3);
        } else if (a*a + b*b < 1) {
            sum = Math.pow(Math.tan(a + b), 4);
        } else {
            sum = -3;
        }

        return sum;
    }
}
