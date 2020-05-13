package com.jfk.Lesson04.Tasks181_190;

public class Task186 {
    public static void main(String[] args) {
        int sum = 20;
        int P = 20;
        int N = 80;
        int k = 1;
        while (sum <= N) {
            sum = sum + sum + sum*P/100;
            k++;
        }
        System.out.println("Day = " + k + "; Way = " + sum + " km");
    }
}
