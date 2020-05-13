package Homework_lesson_4;

public class Task_168 {
    public static void main(String[] args) {

        boolean p = true;
        int n  = 12;
        for ( int i = 2 ; i < n ;i++){
        if ( n % i == 0 ){p= false; }
        }
        System.out.println(p);
    }
}
