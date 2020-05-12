package com.jfk.homework03;

public class Task_168 {
    public static void main(String[] args) {

        int num = 54;
        boolean p = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                p = false;
                break;
            }
        }
        System.out.println(p);
    }
}
