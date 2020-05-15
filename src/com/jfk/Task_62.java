package com.jfk;

public class Task_62 {
    public static void main(String[] args) {
        int number = 3484;
        int g = (number % 10);
        int k = (number % 100) / 10;
        int k1 = (number % 1000) / 100;
        int s = (number % 10000) / 1000;

        if (g + k1 == 0){
            System.out.println("FALSE");
        }
        if (number < 5000) {
            System.out.println((double) number / (g + k1));
        } else {
            System.out.println((double) number / (k +s));
        }
    }
}
