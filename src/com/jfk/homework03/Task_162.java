package com.jfk.homework03;

public class Task_162 {
    public static void main(String[] args) {

        //Print the largest four digit number that after * 14 is a perfect square of a natural number
        for (int i = 9999; i >= 1000; i--) {
            double sr = Math.sqrt(i * 14);

            if (((sr - Math.floor(sr)) == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}

