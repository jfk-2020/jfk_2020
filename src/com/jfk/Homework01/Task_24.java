package com.jfk.Homework01;

public class Task_24 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = 2;

        int eqaulNumber = 0;

        if (a == b) {
            eqaulNumber = a;
        } else if (b == c) {
            eqaulNumber = b;
        } else if (a == c) {
            eqaulNumber = a;
        }

        if (eqaulNumber == 2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
