package com.jfk.thirdHomework;

public class Task_210 {
    public static void main(String[] args) {
        int n = 3454;
        int a = 0;
        int sumEven = 0;
        int sumOdd = 0;
        boolean b = true;

        while (n != 0) {
            a = n % 10;
            n = n / 10;

            if (b) {
                sumOdd = sumOdd + a;
            } else {
                sumEven = sumEven + a;
            }
            b = !b;
        }
        System.out.println(sumEven == sumOdd);
    }
}


