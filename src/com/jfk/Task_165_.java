package com.jfk;

public class Task_165_ {
    public static void main(String[] args) {
        int n  = 29;
        boolean t = false;
        for (int i = 0; i < 1000000000 ; i++){
            if (i*i*i == n){
                t=true;break;
            }

        }
        System.out.println(t);

    }
}
