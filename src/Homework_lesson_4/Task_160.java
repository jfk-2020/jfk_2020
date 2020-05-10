package Homework_lesson_4;

public class Task_160 {
    public static void main(String[] args) {
        int x = 16;
        int y =1;
        for (int i = 100;i>=100&& i< 1000; i++)
        { if (  i*i %x == 0 ){y = i*i / x;;break;}}
        System.out.println(y);
    }
}


