package com.jfk.secondHomework;

public class Task_63 {
    public static void main(String[] args) {
        int number = 5621;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        if(first == 1 || mid == 1 || mid2 == 1 || last == 1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
