package com.jfk;

public class Task_55 {
    public static void main(String[] args) {
        int number = 921;
        int k = (number % 10);
        int d = (number % 100) / 10;
        int f = (number % 1000) / 100;

        if (k <= d && d <= f) {
            System.out.println(f);
        } else if (d <= k && k <= f){
            System.out.println(d);
        } else {
            System.out.println(f);
        }
    }
}
