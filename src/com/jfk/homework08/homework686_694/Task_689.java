package com.jfk.homework08.homework686_694;

public class Task_689 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'C', 'd', 'H', 'f', 'k', 'l'};


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.println(chars);
    }
}
