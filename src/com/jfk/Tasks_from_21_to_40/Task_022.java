package com.jfk.Tasks_from_21_to_40;

public class Task_022 {

    public static void main(String[] args) {
        int a = 50;
        int b = 75;
        int c = 42;

        if (a < b && a < c) {
            System.out.println("minimum " +a);
        }
        else if (b < a && b < c) {
            System.out.println("min " + b);
        }
        else {
            System.out.println("MINIMUM " + c);
        }
    }
}
