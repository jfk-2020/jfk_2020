package Homework_201_210;

public class Task_203 {
    public static void main(String[] args) {
        int n = 2154;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;

        int x = mianish*erknish*eranish*qaranish;

        System.out.println(x);

    }
}
