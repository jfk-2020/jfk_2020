package Homework_211_250;

public class Task_211 {
    public static void main(String[] args) {
        int [] ints = new int[8];
        ints [0] = 2;
        ints [1] = 9;
        ints [2] = -6;
        ints [3] = 4;
        ints [4] = -8;
        ints [5] = 5;
        ints [6] = -9;
        ints [7] = 1;
        int d = 0;
        int q = 0;

        for (int i = 0 ; i < ints.length ;i++){
            if (ints[i] > 0){d= d+ ints[i];q = q+1;}
        }

        System.out.println((double)d/q);

    }
}

