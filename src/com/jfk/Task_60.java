package com.jfk;

public class Task_60 {
    public static void main(String[] args) {
        int number = 543;
        int f = (number % 10);
        int m = (number % 100) / 10;
        int l = (number % 1000) / 100;

        if (f > m && m > l) {
            System.out.println(f+" "+m+" "+l);
        } else if (f > l && l > m) {
            System.out.println(f+" "+l+" "+m);
        } else if (m > f && f > l) {
            System.out.println(m+" "+f+" "+l);
        } else if (m > l && l > f) {
            System.out.println(m+" "+l+" "+f);
        } else if (l > f && f > m) {
            System.out.println(l+" "+f+" "+m);
        } else if (l > m && m > f) {
            System.out.println(l+" "+m+" "+f);
        }
    }
}
