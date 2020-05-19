package Homework_211_250;

public class Task_214 {
    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0] = 1;
        ints[1] = -8;
        ints[2] = -5;
        ints[3] = 2;
    int sum = 0;
    int count = 0;
    for (int i = 0; i < ints.length ; i++){
        if (ints [i] < 0){sum = sum + ints[i] ; count = count + 1;}
    }
        System.out.println((double)sum/count);
    }
}
