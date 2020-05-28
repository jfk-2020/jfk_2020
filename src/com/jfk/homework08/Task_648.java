package com.jfk.homework08;

public class Task_648 {
    public static void main(String[] args) {
        int count = 0;
        boolean xFound = false;

        char[] chars = {'a', '0', 'x', '0', '0', '0'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                xFound = true;
            }
            if (xFound && chars[i] == '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}
