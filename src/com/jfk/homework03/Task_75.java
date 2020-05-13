package com.jfk.homework03;

public class Task_75 {
    public static void main(String[] args) {
        for(double x = -Math.PI; x <= Math.PI; x+=Math.PI/8){
            double y = Math.pow(Math.sin(x), 2) + Math.cos(x);
            System.out.println("x = " + x + "y = " + y);
        }
    }
}
