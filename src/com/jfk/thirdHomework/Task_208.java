package com.jfk.thirdHomework;

public class Task_208 {
    public static void main(String[] args) {
        int n = 4444;
        int a = 0;
        boolean t = true;

        while (n != 0) {
            a = n % 10;
            n = n / 10;

            if (n == a) {
                t = true;
                break;
            } else {
                t = false;
            }
        }
        System.out.println(t);
    }
}


