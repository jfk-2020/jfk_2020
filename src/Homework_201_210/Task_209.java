package Homework_201_210;

public class Task_209 {
    public static void main(String[] args) {
        int n = 2232;
        boolean x = false;
        int t = 0;
        for ( int i = 1; i <= n ; i*= 10 ) {
            t=   n / i % 10;
            if (t % 2 != 0){x=true;break;}
        }
        System.out.println(x);
    }
}
