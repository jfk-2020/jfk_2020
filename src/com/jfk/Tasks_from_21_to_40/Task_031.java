package com.jfk.Tasks_from_21_to_40;

public class Task_031 {
    public static void main(String[] args) {
        int a = 50;
        int b = 75;
        int c = 150;
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
