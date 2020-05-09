package com.jfk;

public class java_59 {
    public static void main(String[] args) {
        int number = 418;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        if(f < m && m < l){
            System.out.println(f + " " + m + " " + l);
        }else if(f < l && l < m){
            System.out.println(f + " " + l + " " + m);
        }else if(m < l && l < f){
            System.out.println(m + " " + l + " " + f);
        }else if(m < f && f < l){
            System.out.println(m + " " + f + " " + l);
        }else if(l < m && m < f){
            System.out.println(l + " " + m + " " + f);
        }else if(l < f && f < m){
            System.out.println(l + " " + f + " " + m);
        }
    }
}
