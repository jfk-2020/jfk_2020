package com.jfk;

public class Task_32 {
    public static void main(String[] args) {
        int a = 60;
        int b = 95;
        int c = 13;
        int d = 18;

        if (a < b && a < c && a < d) {
            System.out.println("minimum " +a);
        }
        else if (b < a && b < c && b < d) {
            System.out.println("minimum " + b);
        }
        else if (c < a && c < b && c < d) {
            System.out.println("minimum " + c);
        } else {
            System.out.println("minimum " + d);
        }
    }
}
