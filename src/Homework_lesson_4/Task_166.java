package Homework_lesson_4;

public class Task_166 {
    public static void main(String[] args) {
        int n = 6561;
        int y = 0;
        for (int i = 0 ; i < 10000000 ; i++){
            if ( (i * i * i * i == n)){y=1;}
        }
        System.out.println(y);
    }
}
