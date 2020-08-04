package Homework_lesson_392_401;

public class Task_393 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 19, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 27};

        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            } else {
                if (counter > maxCount) {
                    maxCount = counter;
                    counter = 0;
                }
            }

        }
        System.out.println(maxCount);
    }
}



