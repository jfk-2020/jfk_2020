package com.jfk.Lesson04.Tasks161_170;

public class Task161 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++){
            boolean itFind = false;
            for (int j = 161; j < i; j++) {
                if (j*j == i * 26) {
                    itFind = true;
                    System.out.println(i);
                    break;
                }
                if (j*j > i*26) {
                    break;
                }
            }
            if (itFind) {
                break;
            }
        }
    }
}
