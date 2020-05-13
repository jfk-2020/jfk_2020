package Homework_201_210;

public class Task_209 {
    public static void main(String[] args) {
        int n = 2274;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;
        boolean x = false;
if (mianish % 2 != 0 || erknish % 2 != 0 || eranish % 2 != 0 || qaranish % 2 != 0  ){x = true;}
        System.out.println(x);
    }
}
