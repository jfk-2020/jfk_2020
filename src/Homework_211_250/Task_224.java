package Homework_211_250;

public class Task_224 {
    public static void main(String[] args) {
        int []array = {5,-9,-7,8,12,3,-23,12,2};
        int k = 8;
        double sum = 0;
        for (int i  = 0 ; i < array.length ; i++)
            if (array[i] > (-1 * k) && array[i] < k) {
                sum = sum + Math.pow(array[i], 3);
            }
        System.out.println(sum);
    }
}
