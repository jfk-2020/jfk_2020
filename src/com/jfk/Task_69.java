package com.jfk;

public class Task_69 {
    public static void main(String[] args) {
        int number = 9278;
        int j =  number % 10;
        int k = (number / 10) % 10;
        int k1 = (number / 100) % 10;
        int s = number / 1000;
        int y = 1;

        if (j + k + k1+ s < 20)
            y = 0;
        System.out.println(y);

    }
}
