package com.jfk.lesson02;

public class Task024 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 1;//2;
        boolean its2 = false;
        if (a == 2) {
            if ((b == 2) && (c != 2)) {
                its2 = true;
            }else if ((b != 2) && (c == 2)) {
                its2 = true;
            }
        } else if ((b == 2) && (c == 2)) {
            its2 = true;
        }
        System.out.println(its2);
    }
}
