package com.jfk;

public class Task_61 {
    public static void main(String[] args) {
        int number = 2644;
        int j = (number % 10);
        int k = (number % 100) / 10;
        int k1 = (number % 1000) / 100;
        int s = (number % 10000) / 1000;

        boolean t = (j + k) == (k1 +s);

        System.out.println(t);



    }
}
