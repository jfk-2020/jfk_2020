package com.jfk.lesson04.Tasks161_170;

public class Task167 {
    public static void main(String[] args) {
        boolean y = false;
        int x = 5;
        for (int i = 1; i < 31; i++){
            if (Math.sin(Math.pow(x, i)) < 0) {
                y = true;
                break;
            }
        }
        System.out.println(y);
    }
}
