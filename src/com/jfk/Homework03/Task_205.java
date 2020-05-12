package com.jfk.Homework03;

public class Task_205 {
    public static void main(String[] args) {
        int n = 5327;
        int reverse = 0;

        while (n != 0) {
            int a = n % 10;
            reverse = reverse + a;

            n = n / 10;
            if (n != 0) {
                reverse = reverse * 10;
            }
        }
        while (reverse != 0) {

            System.out.print(reverse % 10);
            reverse = reverse / 10;
        }
    }
}
