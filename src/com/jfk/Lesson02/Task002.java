package com.jfk.Lesson02;

public class Task002 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = (Math.pow(x, 2) - 4) / (Math.pow(y, 3) + 2);
        sum = sum + Math.pow(2, Math.sin(Math.pow(x*x + 1, 0.5)));

        return sum;
    }
}
