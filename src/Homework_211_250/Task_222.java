package Homework_211_250;

public class Task_222 {
    public static void main(String[] args) {
        int []ints = {2,-5,8,-5,13,-8,5};
        int a = 1;
        int b = 5;
        int sum = 1;
        for (int i = 1; i < 5; i++ ){
            sum =  sum * ints[i];
        }
        System.out.println(sum);
    }
}
