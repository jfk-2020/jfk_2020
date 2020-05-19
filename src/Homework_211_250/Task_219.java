package Homework_211_250;

public class Task_219 {
    public static void main(String[] args) {
        int []ints = new int[15];
        ints [0] = 2;
        ints [1] = 5;
        ints [2] = 45;
        ints [3] = -2;
        ints [4] = 2;
        ints [5] = 7;
        ints [6] = -8;
        ints [7] = 5;
        ints [8] = 36;
        ints [9] = -12;
        ints [10] = 7;
        ints [11] = -9;
        ints [12] = 1;
        ints [13] = -32;
        ints [14] = -2;
        int k = 3;
        int sum = 0;
        for (int i = k ; i < ints.length ; i+=k){
            sum = sum +1;
        }
        System.out.println(sum);
    }
}
