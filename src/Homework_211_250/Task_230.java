package Homework_211_250;

public class Task_230 {
    public static void main(String[] args) {
        int[] array = {5, -8, 12, -4, 13, 15, -6};
        double l = 0;
        int k = 3;
        for (int i = k; i < array.length; i+=k){
           l = l + Math.pow(array[i],2);
        }
        System.out.println((double)Math.sqrt(l));
    }
}

