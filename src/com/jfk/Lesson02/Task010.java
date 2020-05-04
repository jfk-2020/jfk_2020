package com.jfk.Lesson02;

public class Task010 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double z = Math.pow(Math.sin(Math.cos(x + y) + 1), 2);
        double sum = 0;
        sum = Math.sin(Math.PI / 12 + x) * Math.cos((y + z) / (Math.PI + z*z)) + Math.pow(Math.E, z + 4);

        return sum;
    }
}
