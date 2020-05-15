package com.jfk;

public class Task151_ {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        for (int i = n; i <= 99; i ++) {
            if (i % n == 0) {
                sum = sum +i;

            }
            //System.out.println(i);
        }
        System.out.println(sum);
    }
}

