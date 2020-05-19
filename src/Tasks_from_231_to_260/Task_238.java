package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_238 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int count = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println((double) sum / count);
    }
}
