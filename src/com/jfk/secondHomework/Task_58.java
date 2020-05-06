package com.jfk.secondHomework;

public class Task_58 {
    public static void main(String[] args) {
        int number = 281;

        int f = number / 100;
        int m = (number % 100) / 10;
        int l = number % 10;

        int sum = m + l;
        char c;
        if(sum < 5){
            c = 'a';
        }else{
            c = 'b';
        }
        System.out.println(c);
    }
}
