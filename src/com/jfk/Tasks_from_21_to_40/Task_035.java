package com.jfk.Tasks_from_21_to_40;

public class Task_035 {
    public static void main(String[] args) {
        int a = 7;
        int b = 16;
        int c = 15;
        int d = 38;

        boolean f = (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c);
        System.out.println(f);
    }
}
