package com.jfk;

public class Task_55 {
    public static void main(String[] args) {

        int number = 687;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        if (f < m) {
            if (f < l) {
                System.out.println(f);
            } else {
                System.out.println(l);
            }
        } else {
            if (m < l) {
                System.out.println(m);
            } else {
                System.out.println(l);
            }
        }
    }
}
