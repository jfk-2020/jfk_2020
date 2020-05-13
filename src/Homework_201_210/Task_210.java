package Homework_201_210;

public class Task_210 {
    public static void main(String[] args) {
        int n = 5396;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;
         int z = 0;
         int k = 0;
         if (mianish % 2 == 0){z= z + mianish;} else {k = k + mianish;}
        if (erknish % 2 == 0){z= z + erknish;} else {k = k + erknish;}
        if (eranish % 2 == 0){z= z + eranish;} else {k = k + eranish;}
        if (qaranish % 2 == 0){z= z + qaranish;} else {k = k + qaranish;}

        boolean h = z==k;
        System.out.println(h);
    }
}
