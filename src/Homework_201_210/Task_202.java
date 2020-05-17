package Homework_201_210;

public class Task_202 {
    public static void main (String[]args){
            int n = 100109 ;
            int m = 0;
            int sum = 0;
            for (int i= 1;i<= n; i*=10) {

                m = n /i % 10;
                sum = sum + m;
            }


            System.out.println(sum);
        }
    }

