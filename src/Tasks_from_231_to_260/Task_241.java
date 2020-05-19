package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_241 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int sum = 0;
        int k = 2;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Total sum of items: " + sum);
    }
}
