package com.jfk.homework02;

public class Task_66 {
    public static void main(String[] args) {
        int number = 5644;

        int mid2 = (number % 100) / 10;
        int last = number % 10;

        if(last == 4 && mid2 == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
