package com.jfk.Lesson02;

public class Task001 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = (y + 1);
        sum = sum * (x + Math.pow(x*x + 1, 6) * Math.sin(x*x-3) - Math.tan(y));

        //System.out.println(Math.pow(2, 7));
        //System.out.println(Math.sin(60) / Math.cos(60));
        //System.out.println(Math.tan(60));

        return sum;
    }
}
