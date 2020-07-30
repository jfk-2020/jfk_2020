package Homework_lesson_4;

public class Task_165 {
    public static void main(String[] args) {
        int n  = 29;
        boolean t = false;
       for (int i = 0; i < 1000000000 ; i++){
           if (i*i*i == n){
               t=true;break;
           }

       }
        System.out.println(t);

        }
    }

