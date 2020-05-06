package com.jfk.firstHomework;

public class Task_36 {

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 7;
        int d = 20;

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println(true);
        } else if (a % 2 != 0 && c % 2 != 0) {
            System.out.println(true);
        } else if (a % 2 != 0 && d % 2 != 0) {
            System.out.println(true);
        } else if (b % 2 != 0 && c % 2 != 0) {
            System.out.println(true);
        } else if (c % 2 != 0 && d % 2 != 0) {
            System.out.println(true);
        } else if (b % 2 != 0 && d % 2 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}