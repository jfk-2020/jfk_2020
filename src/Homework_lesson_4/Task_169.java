package Homework_lesson_4;

public class Task_169 {
    public static void main(String[] args) {
        int x = 7 ;
        int y = 4;
        int z = 5;
        int n = x+y;
        for ( int i = 2 ; i < x+y ; i++){
            if (n % i == 0){z=6;}
        }
        System.out.println(z);
    }
}
