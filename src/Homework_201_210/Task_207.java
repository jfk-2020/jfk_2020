package Homework_201_210;

public class Task_207 {
    public static void main(String[] args) {
        int n = 3154;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;
        boolean x = false;
        if (mianish == 2 || erknish ==2 ||eranish == 2 || qaranish ==2){ x = true;}

        System.out.println(x);

    }
}
