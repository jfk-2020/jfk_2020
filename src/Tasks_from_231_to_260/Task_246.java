package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_246 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println((double) sum / count);
    }
}
