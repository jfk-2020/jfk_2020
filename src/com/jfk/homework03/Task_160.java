package com.jfk.homework03;

public class Task_160 {
    public static void main(String[] args) {
        //Print the smallest three digit number that after * 16 is a perfect square of a natural number

        for (int i = 100; i <= 999; i++) {
            double sr = Math.sqrt(i * 16);

            if (((sr - Math.floor(sr)) == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
