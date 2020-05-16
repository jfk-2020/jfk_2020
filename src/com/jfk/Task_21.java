package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_21 {


    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 3;

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
