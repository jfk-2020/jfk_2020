package Homework_lesson_4;

public class Task_161 {
    public static void main(String[] args) {
        int x = 26;
        int y =1;
        for (int i = 1 ; i >=1 && i<10000 ; i++){
            if (i*i % x ==0){y = i*i / x;if(y>=1000 && y < 10000){break;}}
        }
        System.out.println( y);
    }
}
