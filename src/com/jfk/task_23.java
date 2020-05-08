package com.jfk;

public class task_23 {

    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 9;

        if (a == b) {
            System.out.println(true);
        } else if (b == c) {
            System.out.println(true);
        } else if (a == c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
