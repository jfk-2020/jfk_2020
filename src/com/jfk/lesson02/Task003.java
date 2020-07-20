package com.jfk.lesson02;

public class Task003 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = Math.atan(Math.abs(x*x - y) / (x*x +y*y));
        sum = sum + Math.log10(x*x + 1);

        //System.out.println(Math.log10(100));
        //System.out.println(Math.log(8) / Math.log(2));
        return sum;
    }
}
