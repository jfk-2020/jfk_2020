package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_71 {

    public static void main(String[] arg) {
        double y = 0;
        double x = 2.4;
        do {
            y = Math.tan(2 * x + Math.pow(x, 2));
            System.out.println("Y : " + y);
            x = x + 0.2;
        } while (x <= 7.6);

        for (x = 2.4; x < 7.6; x += 0.2) {
            System.out.println(Math.tan(2 * x + Math.pow(x, 2)));
        }
    }
}
