package com.jfk.lesson04.Tasks161_170;

public class Task154_ {
    public static void main(String[] args) {
        int n = 779;
        long sum = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 3) {
                sum *= i;
            }
        }
        System.out.println(sum);
    }
}
