package com.jfk.thirdHomework;

//print the product of all the natural numbers that % n == 0
public class Task_152 {
    public static void main(String[] args) {
        int n = 74;
        int product = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                product = product * i;
                System.out.println(i);
            }
        }
        System.out.println(product);
    }
}
