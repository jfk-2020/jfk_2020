package Homework_201_210;

public class Task_210 {
    public static void main(String[] args) {
        int n = 2635;

         int z = 0;
         int k = 0;
         for (int i = 1 ; i <= n ; i*=10){
             int t = n/i %10;
             if (t % 2 ==0){z = z +t;} else {k = k + t;}
         }

        boolean h = z==k;
        System.out.println(h);
    }
}
