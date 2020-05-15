package com.jfk;

public class Task153_ {
    public static void main(String[] args) {
        int n = 6 ;
        int sum = 0;
        for (int i = n ; i < 13 ; i++){
            if (i % n == 2){
                sum = sum + i ;}
        }
        System.out.println(sum);
    }
}
