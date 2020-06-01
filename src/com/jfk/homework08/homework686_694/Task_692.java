package com.jfk.homework08.homework686_694;

public class Task_692 {
    public static void main(String[] args) {
        char[] charsA = {'2', '3', '5', '7', '9'};
        char[] charsB = new char[charsA.length];

        for (int i = 0; i < charsA.length; i++) {
            charsB[charsA.length - 1 -i] = charsA[i];
        }
        System.out.println(charsB);
    }
}
