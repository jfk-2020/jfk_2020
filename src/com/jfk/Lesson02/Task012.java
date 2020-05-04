package com.jfk.Lesson02;

public class Task012 {
    public static void main(String[] args) {
        double x = 9;
        double a = 17;
        //double b = 1;
        System.out.println(expression(x, a));
    }
    public static double expression(double x, double a){
        double sum = 0;
        if (-5 <=x && x >= 5) {
            sum = Math.pow(1 + a*a, 6);
        } else if (x > 5) {
            sum = Math.cos(Math.pow(Math.log(Math.abs(x)), 2)) + Math.pow(x, 8);
        } else {
            sum = a;
        }

        return sum;
    }
}
