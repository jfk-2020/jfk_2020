package com.jfk;

public class Task_214 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        int[] a = new int[5];
        a[0] = 52;
        a[1] = 4;
        a[2] = -6;
        a[3] = -12;
        a[4] = 3;

        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0){
                sum += a[i];
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}
