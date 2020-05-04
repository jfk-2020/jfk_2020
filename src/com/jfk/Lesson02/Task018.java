package com.jfk.Lesson02;

public class Task018 {
    public static void main(String[] args) {
        double x = 3;
        double z = 4;
        System.out.println(expression(x, z));
    }
    public static double expression(double x, double z){
        double sum = 0;
        if (1 <=x && x <= 7) {
            sum = Math.pow(Math.abs(x) + 2*Math.abs(z), 0.25) + Math.pow(Math.E, Math.abs(x+1));
        } else {
            sum = Math.pow(Math.tan(Math.pow(x+ z, 7)), 2);
        }

        return sum;
    }
}
