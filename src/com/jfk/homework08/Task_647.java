package com.jfk.homework08;

public class Task_647 {
    public static void main(String[] args) {
        boolean t = true;

        char[] chars = {'s', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 's'};
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != chars[chars.length - 1 - i]) {
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}
