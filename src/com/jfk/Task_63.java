package com.jfk;

public class Task_63 {
    public static void main(String[] args) {
        int sum = 4222;
        int f = (sum % 10);
        int m = (sum % 100) / 10;
        int m1 = (sum % 1000) / 100;
        int l = (sum% 10000) / 1000;
        int y = 0;

        if (f == 1 || m == 1 || m1 == 1 || l == 1)
            y = 1;

        System.out.println(y);
    }
}
