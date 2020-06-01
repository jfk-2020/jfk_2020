package com.jfk.homework08;

public class Task_659 {
    public static void main(String[] args) {
        char[] chars = {'c', 'd', 'c', 'd', 'd', 'd', 'c'};

        boolean x = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                x = true;
            }
        }
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < chars.length; i++) {
            if (x == true) {
                if (chars[i] == 'c') {
                    countC++;
                }
            } else {
                if (chars[i] == 'd') {
                    countD++;
                }
            }
        }
        if (x == true) {
            System.out.println(countC);
        } else {
            System.out.println(countD);
        }
    }
}
