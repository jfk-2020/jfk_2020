package com.jfk.homework03;

public class Task_151 {
    public static void main(String[] args) {

        int n = 64;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
