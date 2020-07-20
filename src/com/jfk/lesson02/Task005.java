package com.jfk.lesson02;

public class Task005 {
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println(expression(x, y));
    }
    public static double expression(double x, double y){
        double sum = 0;
        sum = (Math.pow(2, x) - 5) / (Math.pow(3, y) + 2);
        sum = sum + Math.log(Math.pow(Math.abs(x) + 1, 4) + y*y) / Math.log(2);

        //System.out.println(Math.log10(100));
        //System.out.println(Math.log(8) / Math.log(2));
        return sum;
    }
}
