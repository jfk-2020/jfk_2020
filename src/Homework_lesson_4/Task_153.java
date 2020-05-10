package Homework_lesson_4;

public class Task_153 {
    public static void main(String[] args) {
        int n = 4 ;
        int sum = 0;
        for (int i = n ; i < 13 ; i++){
            if (i % n == 2){
                    sum = sum + i ;}
        }
        System.out.println(sum);
    }
}
