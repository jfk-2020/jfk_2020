package com.jfk.homework08;

public class Task_659 {
    public static void main(String[] args) {
        char[] chars = {'c', 'x', 'c', 'd', 'd', 'd', 'c'};

        boolean x = false;
        int countC = 0;
        int countD = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                x = true;
            } else if(chars[i] == 'c'){
                countC++;
            }else if(chars[i] == 'd'){
                countD++;
            }
        }

        if (x) {
            System.out.println(countC);
        } else {
            System.out.println(countD);
        }
    }
}
