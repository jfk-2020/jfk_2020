package com.jfk;

/**
 * @author William Arustamyan
 */

public class Task_151 {

    public static void main(String[] args) {

        int n = 53;
        int sum = 0;
        for (int i = n; i < 10_000_0; i ++) {
            if (i % n == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
