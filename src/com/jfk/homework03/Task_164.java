package com.jfk.homework03;

public class Task_164 {
    public static void main(String[] args) {

        int n = 13;
        for (int i = 100; i <= 999; i++) {

            double sr = Math.sqrt(i);
            if (sr > n) {
                System.out.println(i);
                break;
            }
        }
    }
}
