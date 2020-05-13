package Homework_201_210;

public class Task_206 {
    public static void main(String[] args) {
        int n = 2154;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;

        int m = mianish * 1000 + erknish * 100 + eranish * 10 + qaranish;
        System.out.println(m);
    }
}
