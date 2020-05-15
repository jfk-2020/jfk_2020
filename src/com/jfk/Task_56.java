package com.jfk;

public class Task_56 {
    public static void main(String[] args) {
        int number = 759;
        int j = (number % 10);
        int b = (number % 100) / 10;
        int c = (number % 1000) / 100;

        if(j > b){
            System.out.println((double) (j + b + c) / number);
        } else {
            System.out.println(number);
        }
    }
}
