package com.jfk;

public class Task_65 {
    public static void main(String[] args) {
        int number =2643;
        int j =  number % 10;
        int k = (number / 10) % 10;
        int k1 = (number / 100) % 10;
        int s = number / 1000;
        String result = "y = 0";

        if (j * k == 12)
            result = "y = 12";
        System.out.println(result);
    }
}
