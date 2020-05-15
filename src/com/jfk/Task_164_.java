package com.jfk;

public class Task_164_ {
    public static void main(String[] args) {
        int n = 10;
        int y = 1;
        for (int i = 10;  i*i > 99 && i*i < 1000 ; i++){
            if (i > n){y = i*i;break;}
        }
        System.out.println(y);
    }
}
