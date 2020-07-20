package com.jfk.lesson04.Tasks161_170;

public class Task162 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1000; i < 10000; i++){
            for (int j = 118; j < i; j++) {
                if (j*j == i * 14) {
                    number = i;
                }
                if (j*j > i*14) {
                    break;
                }
            }
        }
        System.out.println(number);
    }
}
