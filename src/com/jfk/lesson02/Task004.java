package com.jfk.lesson02;

public class Task004 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = Math.log(Math.pow(Math.E, x) + 1);
        sum = sum + Math.pow(x*x + 4, 1.0/3);

        //System.out.println(Math.pow(125, 1.0/3));
        //System.out.println(Math.log10(100));
        //System.out.println(Math.log(8) / Math.log(2));
        return sum;
    }
}
