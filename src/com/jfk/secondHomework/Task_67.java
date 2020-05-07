package com.jfk.secondHomework;

public class Task_67 {
    public static void main(String[] args) {
        int number = 1234;

        int first = number / 1000;
        int mid = (number % 1000) / 100;
        int mid2 = (number % 100) / 10;
        int last = number % 10;

        int square = (last + mid2 + mid + first)*(last + mid2 + mid + first);
        if(number == square){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
