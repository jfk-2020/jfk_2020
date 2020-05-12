package com.jfk.Homework03;

public class Task_153 {
    public static void main(String[] args) {
//Print the sum of all natural numbers that n % i == 2
        int n = 104;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 2) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
