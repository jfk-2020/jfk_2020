package com.jfk;

public class Task_158_ {
    public static void main(String[] args) {
        long n = 2;
        long m = 3;
        long sum = 1;
        // eranish tivy chapazanc shat mec e:
        for (long i = 10 ; i>= 10 && i < 100 ; i++){
            if (!(i % n == 0 && i % m == 0) ){
                sum = sum * i ;
            }
        }
        System.out.println(sum);
    }
}
