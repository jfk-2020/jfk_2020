package com.jfk.lesson04.Tasks161_170;

public class Task160_ {
    public static void main(String[] args) {
        System.out.println(100);
        for (int i = 101; i < 1000; i++){
            boolean itFind = false;
            for (int j = 40; j < i; j++) {
                if (j*j == i * 16) {
                    itFind = true;
                    System.out.println(i);
                    break;
                }
            }
            if (itFind) {
                break;
            }
        }
    }
}
