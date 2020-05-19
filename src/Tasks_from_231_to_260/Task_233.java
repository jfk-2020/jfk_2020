package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_233 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int sum = 0;
        int multiple = 1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                multiple = multiple * numbers[i];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(multiple);
    }
}
