package com.jfk;

public class Task_67 {
    public static void main(String[] args) {
        int number = 6666;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        String result = "NO";
        int sum = (f + m + m1 + l);

        if (number == (f + m + m1 + l) * sum)
            result = "YES";
        System.out.println(result);
    }
}
