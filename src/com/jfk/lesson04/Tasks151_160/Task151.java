package com.jfk.lesson04.Tasks151_160;

public class Task151 {
    public static void main(String[] args) {
        System.out.println(calculate(7, 2));
    }
    static double calculate(int n, double x) {
        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += Math.pow(Math.log(3), i) * Math.pow(x, n) / faktorial(i);
        }
        return sum;
    }

    public static double faktorial(int n){
        double sum = 1;
        for (int i = 2; i <=n ; i++){
            sum *= i;
            //System.out.println(sum);
        }
        return sum;
    }
}
