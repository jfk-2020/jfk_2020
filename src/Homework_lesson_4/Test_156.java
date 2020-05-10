package Homework_lesson_4;

public class Test_156 {
    public static void main(String[] args) {
        int n = 3 ;
        int m = 5 ;
        int sum = 1;

        for (int i = 1 ; i < 15 ; i++){
            if (i % n == 0 || i % m == 0){
                sum = sum * i ;
            }

        }
        System.out.println(sum);
    }
}
