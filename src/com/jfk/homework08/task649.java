package com.jfk.homework08;

public class task649 {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        int temp = 0;

        char[] chars = {'z', 'j', 'k', 'l', 'i', 'z', 'k'};
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'z') {
                temp = i - count;
                count = i;
            }

        }

        System.out.println(temp - 1);
    }
}

