package com.jfk.Tasks_from_21_to_40;

public class Task_030 {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;
        int c = 10;

        if (a > b && b > c) {
            System.out.println(a+" "+b+" "+c);
        } else if (a > c && c > b) {
            System.out.println(a+" "+c+" "+b);
        } else if (b > a && a > c){
            System.out.println(b+" "+a+" "+c);
        } else if (b > c && c > a){
            System.out.println(b+" "+c+" "+a);
        } else if (c > a && a > b){
            System.out.println(c+" "+a+" "+b);
        } else if (c > b && b > a){
            System.out.println(c+" "+b+" "+a);
        }
    }
}
