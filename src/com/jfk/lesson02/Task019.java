package com.jfk.lesson02;

public class Task019 {
    public static void main(String[] args) {
        double a = 17;
        double b = 1;
        double c = 5;
        System.out.println(expression(a, b, c));
    }
    public static double expression(double a, double b, double c){
        double sum = 0;
        if (a + b < 7) {
            sum = Math.pow(Math.atan(a*a + b*b + c), 2);
        } else {
            sum = Math.pow(10, -7);
        }

        return sum;
    }
}
