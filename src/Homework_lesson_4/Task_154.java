package Homework_lesson_4;

public class Task_154 {
    public static void main(String[] args) {

   int n = 4;
   int sum = 1;

        for (int i = n ; i < 20 ; i++ ){
       if (i % n == 3 ){
           sum = sum*i;
       }
   }
        System.out.println(sum);

    }
}
