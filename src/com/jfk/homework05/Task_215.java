package com.jfk.homework05;
public class Task_215 {
    public static void main(String[] args) {
        int sum = 0;

        int[]a = new int[5];
        a[0] = 2;
        a[1] = 7;
        a[2] = 5;
        a[3] = 15;
        a[4] = 20;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
