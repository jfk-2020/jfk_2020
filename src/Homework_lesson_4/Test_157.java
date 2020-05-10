package Homework_lesson_4;

public class Test_157 {
    public static void main(String[] args) {
            int n = 5 ;
            int sum = 0;
            for (int i = n ; i >= 100 && i < 1000; i++){
                if ( !( i % 5 == 0) ){ sum = sum + i;}
            }

        System.out.println(sum);
    }
}
