package com.jfk;

public class Task_161_ {
    public static void main(String[] args) {
        int x = 36;
        int y =1;
        for (int i = 1 ; i >=1 && i<10000 ; i++){
            if (i*i % x ==0){y = i*i / x;if(y>=1000 && y < 10000){break;}}
        }
        System.out.println( y);
    }
}
