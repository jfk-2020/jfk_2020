package com.jfk.homework08.homework686_694;

public class Task_687 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', '2', '6', '5', 'h', '0', 'y', '9'};
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                count++;
            }
        }
        System.out.println(count);
    }
}
