package com.jfk.Homework03;

public class Task_159 {
    public static void main(String[] args) {

        //print the product of all the three digit numbers that % 3 ==1 and % 4 ==2
        long product = 1;

        for (int i = 100; i <= 555; i++) {
            if (i % 3 == 1 && i % 4 == 2) {
                product = product * i;
                System.out.println(i);
            }
        }
        System.out.println(product);
    }
}
