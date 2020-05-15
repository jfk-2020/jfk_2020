package com.jfk;

public class Task_70 {
    public static void main(String[] args) {
        int number = 1234;
        int j =  number % 10;
        int k = (number / 10) % 10;
        int k1 = (number / 100) % 10;
        int s = number / 1000;
        int y = 0;

        if (j * k * k1 * s < 200)
            y = 1;
        System.out.println(y);
    }
}
