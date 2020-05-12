package com.jfk.homework03;

public class Task_203 {
    public static void main(String[] args) {
        int n = 1235;
        int product = 1;

        while(n != 0){
            product *= n % 10;
            n = n/10;
        }
        System.out.println(product);
    }
}
