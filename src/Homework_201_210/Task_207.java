package Homework_201_210;

public class Task_207 {
    public static void main(String[] args) {
        int n = 3354824;
        boolean x = false;
        int t = 0;
         for ( int i = 1 ; i <= n ; i*= 10 ){
             t = n / i % 10;

             if (t == 2){x =true ;}
         }

        System.out.println(x);

    }
}
