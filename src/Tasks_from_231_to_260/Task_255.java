package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_255 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);

        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                sum = i + max;
            }
        }
        System.out.println(sum);
    }
}
