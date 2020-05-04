package com.jfk.Lesson02;

public class Task014 {
    public static void main(String[] args) {
        double a = 17;
        double b = 1;
        System.out.println(expression(a, b));
    }
    public static double expression( double a, double b){
        double sum = 0;
        if (a + b < 3) {
            sum = Math.pow(Math.atan(a+b), 4);
        } else if (a + b > 5) {
            sum = Math.pow(Math.log(a + b) / Math.log(8), 2);
        } else {
            sum = a + Math.pow(a, 15);
        }

        return sum;
    }
}
