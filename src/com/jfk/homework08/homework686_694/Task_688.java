package com.jfk.homework08.homework686_694;

public class Task_688 {
    public static void main(String[] args) {
        char[] chars = {'a', 'A', 'B', 'C', 'd', 'g', 'H'};

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                count++;
            }
        }
        System.out.println(count);
    }
}
