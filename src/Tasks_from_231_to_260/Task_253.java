package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_253 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(max + min);
    }
}