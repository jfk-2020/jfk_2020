package com.jfk.lesson02;

public class Task036 {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int c = 7;
        int d = 12;
        int[] array = {a, b, c, d};
        int sum = 0;
        for (int x : array) {
            if (x % 2 == 1) {
                sum++;
            }
        }
        System.out.println(sum > 1);
    }
}
