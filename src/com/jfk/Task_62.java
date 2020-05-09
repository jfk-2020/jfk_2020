package com.jfk;

public class Task_62 {
    public static void main(String[] args) {

        int number = 3761;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        int a = number / (last + mid);
        int b = number / (first + mid2);

        if(number < 5000){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
