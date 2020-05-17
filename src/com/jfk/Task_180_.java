package com.jfk;

public class Task_180_ {
    public static void main(String[] args) {
        int N = 80;
        int sum = 1;
        while (sum < N) {
            sum *= 3;
        }
        System.out.println(sum == N);
    }
}
