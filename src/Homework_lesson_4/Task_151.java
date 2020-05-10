package Homework_lesson_4;

import org.w3c.dom.ls.LSOutput;

public class Task_151 {
    public static void main(String[] args) {

        int n = 4;
        int sum = 0;
        for (int i = n; i<100 ;i++ )
        {   if ( i % n == 0 ){ sum = sum + i ;};
      }
        System.out.println( sum);

    }
}

