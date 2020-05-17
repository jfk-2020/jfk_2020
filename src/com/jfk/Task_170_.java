package com.jfk;

public class Task_170_ {
    public static void main(String[] args) {
        int n = 17;
        int x= 1;
        for (int i = 2; i >1 ; i++){
            if (Math.pow(i,2)>n){x = i ;break;}
        }
        System.out.println(Math.pow(x,2));
    }
}
