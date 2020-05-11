package com.jfk.thirdHomework;

public class Task_169 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 5;

        int sum = x + y;
        for (int i = 2; i < sum / 2; i++) {
            if (sum % i == 0) {
                z = 6;
                break;
            }
        }
        System.out.println(z);
    }
}
