package com.jfk.homework09;

//Sum of the numbers
public class Recursion_01 {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(recurSum(n));
    }

    // Returns sum of n numbers
    public static int recurSum(int n) {
        if (n == 1){
            return n;
        }else {
            return n + recurSum(n - 1);
        }
    }
}



