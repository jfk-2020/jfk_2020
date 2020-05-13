package com.jfk.homework03;

public class Task_74 {
    public static void main(String[] args) {
        for(double x = -3.8; x <= 5.4; x += 0.3){
            double y = Math.pow(2, x + 4);
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
