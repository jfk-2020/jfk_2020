package com.jfk.Tasks_from_21_to_40;

public class Task_034 {
    public static void main(String[] args) {
        int a = 50;
        int b = 36;
        int c = 52;
        int d = 38;

        boolean z = (a + b == c + d || a + c == b + d || a + d == b + c);
        System.out.println(z);
    }
}
