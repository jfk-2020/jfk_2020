package com.jfk;

public class Task_31 {
    public static void main(String[] args) {
        int a = 47;
        int b = 64;
        int c = 110;
        int d = 100;

        if (a > b && a > c && a > d) {
            System.out.println("maximum " +a);
        }
        else if (b > a && b > c && b > d) {
            System.out.println("maximum " + b);
        }
        else if (c > a && c > b && c > d){
            System.out.println("maximum " + c);
        } else {
            System.out.println("maximum " + d);
        }
    }
}
