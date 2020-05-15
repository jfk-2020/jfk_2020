package com.jfk;

public class Task_159_ {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int sum = 1;
        // eranish tvov anhamemat mec klini
        for (int i = 10 ;i >= 10 && i < 100 ; i++){
            if (i % 3 == 1 && i % 4 == 2){sum = sum * i ;}
        }
        System.out.println(sum);
    }
}
