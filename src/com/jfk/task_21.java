package com.jfk;

public class task_21 {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 30;

        int max = a;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println(max);
    }

}
