package com.jfk;

/**
 * @author William Arustamyan
 */

public class IfStatement {

    public static void main(String[] args) {
        if (1 < 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        System.out.println("DONE");
        int b = 100;
        int x = 20;
        {
            if (b > 10) {
                System.out.println("B > 10");
            }
        }
        boolean isBigger = x > 30;
        System.out.println("isBigger = " + isBigger);
        if (isBigger) {
            System.out.println("X > 30");
        } else if (x <= 20) {
            System.out.println("X <= 20");
        } else if (x >= 25){
            System.out.println("X > 25");
        } else {
            System.out.println("ELSE");
        }
    }
}
