package Homework_201_210;

public class Task_208 {
    public static void main(String[] args) {
        int n = 2622;
        int mianish= n%10;
        int erknish=n%100 / 10;
        int eranish= n%1000 /100;
        int qaranish= n/1000;
        boolean x = false;
 if (mianish == erknish && erknish == eranish && eranish== qaranish){x = true;}
        System.out.println(x);
    }
}
