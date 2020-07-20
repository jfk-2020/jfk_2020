package com.jfk.lesson02;

public class Task017 {
    public static void main(String[] args) {
        double a = 17;
        double z = 5;
        System.out.println(expression(a, z));
    }
    public static double expression(double a, double z){
        double sum = 0;
        if (Math.abs(a) > 3) {
            sum = Math.pow(Math.log(4 + a*a) / Math.log(2), 5) + Math.tan(z + a);
        } else {
            sum = Math.pow(Math.pow(z, 4) + 4*a, 5);
        }

        return sum;
    }
}
