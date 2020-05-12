package com.jfk.Lesson04.Tasks161_170;

public class Task169 {
    public static void main(String[] args) {
        int z = 6;
        int x = 87;
        int y = 39;
        for (int i = 2; i < (x + y) / 2 + 1; i++){
            if ((x + y) % i == 0) {
                z = 5;
            }
        }
        System.out.println(z);
    }
}
