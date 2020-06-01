package com.jfk.homework08.homework686_694;

public class Task_694 {
    public static void main(String[] args) {
        char[] chars = {'6', '-', '4', '+', '2', '-', '5'};

        int sum = chars[0] - 48;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 45) {
                sum = sum - (chars[i + 1] - 48);
            } else {
                if (chars[i] == 43) {
                    sum = sum + (chars[i + 1] - 48);
                }
            }
        }
        System.out.println(sum);
    }
}


