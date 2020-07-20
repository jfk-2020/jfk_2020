package com.jfk.lesson02;

public class Task009 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double z = Math.pow((x+4) / Math.pow(y*y +4, 3), 1.0/5);
        double sum = 0;
        sum = Math.sin(Math.pow(x + z, 2)) + 3*z + y / (x*x);

        return sum;
    }
}
