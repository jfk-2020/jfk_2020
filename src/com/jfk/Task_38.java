package com.jfk;

public class Task_38 {
    public static void main(String[] args) {
        double a = 64;
        double b = 128;
        double c = 256;
        double d = 512;
        if (a==0 || b==0 || c==0 || d==0) {
            System.out.println("FALSE");
        }
        else if(b/a==c/b || b/a==d/c || c/a==d/b)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}
