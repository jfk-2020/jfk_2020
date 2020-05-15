package com.jfk;

public class Task_163_ {
    public static void main(String[] args) {
        int x = 18;
        int y = 1 ;
        for (int i = 0; i< 10000 ; i++){
            if (i*i % x == 0){if (i*i / x > 9999){break;}else {y = i*i / x;}}
        }
        System.out.println(y);
    }
}
