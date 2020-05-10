package com.jfk.thirdHomework;

public class Task_158 {
    public static void main(String[] args) {
        //print the sum of all the three digit numbers that % 2 !=0 and % 3 !=0
        long product = 1;

        for (int i = 100; i <= 999; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
               product = product * i;
                System.out.println(i);
            }
        }
        System.out.println(product);
    }
}

