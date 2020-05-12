package com.jfk.homework02;

//print true if the sum of the number points and the decimal points equals to the sum of hundred points and thousand points.
public class Task_61 {
    public static void main(String[] args) {
        int number = 3571;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        boolean t;

        if (last + mid2 == mid + first) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }
}
