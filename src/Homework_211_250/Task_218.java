package Homework_211_250;

public class Task_218 {
    public static void main(String[] args) {
        int [] ints = new int[8];
        ints [0] = 5 ;
        ints [1] = 12 ;
        ints [2] = -8 ;
        ints [3] = -3;
        ints [4] = -7 ;
        ints [5] = 8 ;
        ints [6] = 7 ;
        ints [7] = -1 ;
        int sum = 0;
        for (int i = 1 ; i < ints.length ; i+=2){
            if (ints[i]<0){sum = sum+(-1 * ints[i]);}
            else {sum = sum + ints[i];}
        }
        System.out.println(sum);
    }
}
