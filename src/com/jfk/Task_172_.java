package com.jfk;

public class Task_172_ {
    public static void main(String[] args) {
        int N = 11;
        long sum = N;
        while (N > 0) {
            N -= 2;
            if (N > 0) {
                sum *= N;
                //System.out.println(N);
            }
        }
        System.out.println(sum);
    }
}
