package com.jfk.homework03;

public class Task_154 {
    public static void main(String[] args) {

//print the product of all numbers that n % i == 3
        int n = 120;
        int product = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 3) {
                product = product * i;
                System.out.println(i);
            }
        }
        System.out.println(product);
    }
}
