package com.jfk.implementClasses;

public class MainTime {
    public static void main(String[] args) {
        Time time = new Time(3,15, 55);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
    }
}
