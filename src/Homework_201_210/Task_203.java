package Homework_201_210;

public class Task_203 {
    public static void main(String[] args) {
       int n = 2251145;
       int m = 0;
       int sum = 1;
       for (int i = 1 ; i <= n; i*= 10){
           m = n /i % 10;
           sum = sum *m;
       }
        System.out.println(sum);
    }
}
