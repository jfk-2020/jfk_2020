package com.jfk.homework04;

public class Task_92 {
    public static void main(String[] args) {
        int n = 13;
        double x = 0;
        double product = 1;

        for(int i = 1; i <= n; i++){
            if(i == 1){
                x = 0.5;
            }else{
                x = Math.tan(x + 2);
            }
            product *= x;
        }
        System.out.println(product);
    }
}
