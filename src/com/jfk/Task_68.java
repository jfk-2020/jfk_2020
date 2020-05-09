package com.jfk;

public class Task_68 {
    public static void main(String[] args) {
        int number = 3789;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;
        int product = last * mid;

        if(last > mid){
            System.out.println(product);
        }else{
            System.out.println(1);
        }
    }
}
