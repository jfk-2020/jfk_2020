package com.jfk;

public class Task_36 {
    public static void main(String[] args) {
        int a = 6;
        int b = 16;
        int c = 37;
        int d = 30;

        if (a%2!= 0 && b%2!=0 || a%2!=0 && c%2!=0|| a%2!=0 && d%2!= 0){
            System.out.println("1");
        }
        else if(b%2!=0 && c%2!=0 || b%2!=0 && d%2!=0){
            System.out.println("1");
        }
        else if(c%2!=0 && d%2!=0){
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
    }
}
