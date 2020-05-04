package com.jfk;

public class Task22 {
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        int c = 100;
        if (a<b) {
            if (a<c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }

}
