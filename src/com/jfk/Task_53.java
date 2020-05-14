package com.jfk;

public class Task_53 {
    public static void main(String[] args) {
        int k = 500;
        int myNumber = 233;

        int f = myNumber / 100;
        int m = (myNumber % 100) / 10;
        int l = myNumber % 10;
        int sum = f + m + l;

        if (myNumber > k) {
            System.out.println(myNumber - sum);
        } else {
            System.out.println(l - myNumber);
        }
    }
}
