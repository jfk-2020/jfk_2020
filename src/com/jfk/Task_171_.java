package com.jfk;

public class Task_171_ {
    public static void main(String[] args) {
        long n = 13;
        long sum = 1 ;
        for (int i = 1 ; i <= n ; i++){
            sum = i*sum ;
        }
        System.out.println(sum);
    }
}
