package com.jfk.thirdHomework;

public class Task_161 {
    public static void main(String[] args) {

        //Print the smallest four digit number that after * 26 is a perfect square of a natural number
        for (int i = 1000; i <= 9999; i++) {
            double sr = Math.sqrt(i * 26);

            if (((sr - Math.floor(sr)) == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
