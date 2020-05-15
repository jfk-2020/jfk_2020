package com.jfk;

public class Task_66 {
    public static void main(String[] args) {
        int number = 4466;
        int j =  number % 10;
        int k = (number / 10) % 10;
        int k1 = (number / 100) % 10;
        int s = number / 1000;
        String result = "NO";

        if (j == 4 && s == 4)
            result = "YES";
        System.out.println(result);
    }
}
