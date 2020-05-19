package Homework_201_210;

public class Task_208 {
    public static void main(String[] args) {
        int n = 2222;
        boolean x = false;
        int t = 0;
        int k = 0;
        for ( int i = 1; i <= n ; i*= 10 ) {
         t=   n / i % 10;
        if (n>=10*i){k = n /(10*i) %10;} else {x=true;}
         if (t==k ){x= true;}
         else { x = false ; break;}


        }
        System.out.println(x);
    }
}
