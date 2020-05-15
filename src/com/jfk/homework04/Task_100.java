package com.jfk.homework04;

public class Task_100 {
    public static void main(String[] args) {
        int n = 30;
        double x = 0;
        double product = 1;

        for(int i = 0; i <= n; i++){
            if(i == 0){
                x = 1;
            }else{
                x = 1/ Math.tan(x) + 1;
            }
            product *= x;
        }
        System.out.println(product);
    }
}
