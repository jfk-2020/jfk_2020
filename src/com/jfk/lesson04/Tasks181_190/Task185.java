package com.jfk.lesson04.Tasks181_190;

public class Task185 {
    public static void main(String[] args) {
        int sum = 30000;
        int P = 20;
        int N = 100000;
        int k = 0;
        while (sum <= N) {
            sum = sum + sum*P/100;
            k++;
        }
        System.out.println("Month = " + k + "; Sum = " + sum);
    }
}
