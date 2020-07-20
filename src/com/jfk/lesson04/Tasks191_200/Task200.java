package com.jfk.lesson04.Tasks191_200;

public class Task200 {
    public static void main(String[] args) {
        int N = 10;
        double x = 2;
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            double sum1 = 1;
            double sum2 = 1;
            for (int j = 1; j <= N; j++) {
                if (j > 2) {
                    sum1 *= 2*j - 3;
                }
                sum2 *= 2*j;
            }
            System.out.println(sum1);
            System.out.println(sum2);
            sum += Math.pow(-1, i-1) * sum1 * Math.pow(x, i)/ sum2;
        }
        System.out.println(sum);
    }
}
