package com.jfk.lesson02;

public class Task015 {
    public static void main(String[] args) {
        double x = 3;
        double a = 17;
        double b = 1;
        double c = 5;
        System.out.println(expression(x, a, b, c));
    }
    public static double expression(double x, double a, double b, double c){
        double sum = 0;
        if (-1 <=c && c <= 1) {
            sum = b + Math.pow(Math.tan(c + a), 5);
        } else if (c <= - 1) {
            sum = Math.cos(Math.pow(Math.log(Math.abs(x)), 2)) + Math.pow(x, 8);
        } else {
            sum = a + Math.pow(a, -10);
        }

        return sum;
    }
}
