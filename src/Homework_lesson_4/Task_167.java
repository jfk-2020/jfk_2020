package Homework_lesson_4;


public class Task_167 {
    public static void main(String[] args) {
        boolean y = false;
        int x = 1;


        for (int n = 2; n < 30; n++) {
            if (Math.sin(Math.pow(x, n)) < 0) {
                y = true;
            }
        }
        System.out.println(y);
    }
}