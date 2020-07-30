package Homework_211_250;

public class Task_228 {
    public static void main(String[] args) {
        int[] array = {5, -8, 12, -4, 13, 15, -6};
        int sum = 0;
        int k = 3;
        for (int i = k; i < array.length; i += k) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
