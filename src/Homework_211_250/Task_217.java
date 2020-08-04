package Homework_211_250;

public class Task_217 {
    public static void main(String[] args) {
        int []ints = new int[7];
        ints [0] = 18;
        ints [1] = 9;
        ints [2] = -1;
        ints [3] = 25;
        ints [4] = -11;
        ints [5] = 6;
        ints [6] = 18;
        double sum = 1;
        for (int i = 1; i < ints.length ; i+=2){
            sum = sum * Math.pow(ints[i],2);
        }

        System.out.println(sum);
}
}
