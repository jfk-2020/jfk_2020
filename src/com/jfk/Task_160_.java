package com.jfk;

public class Task_160_ {
    public static void main(String[] args) {
        int x = 16;
        int y =1;
        for (int i = 1;i>=1&& i< 1000; i++)
        { if (  i*i %x == 0 ){y = i*i / x; if (y >99 && y < 1000){break;}}}
        System.out.println(y);
    }
}
