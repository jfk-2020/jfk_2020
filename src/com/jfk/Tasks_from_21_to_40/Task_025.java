package com.jfk.Tasks_from_21_to_40;

public class Task_025 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 8;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y = 1");
        } else
            System.out.println("y = 2");
    }
}
