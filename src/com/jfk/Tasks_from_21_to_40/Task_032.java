package com.jfk.Tasks_from_21_to_40;

public class Task_032 {
    public static void main(String[] args) {
        int a = 50;
        int b = 75;
        int c = 42;
        int d = 43;

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
