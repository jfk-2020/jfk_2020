package Tasks_from_211_to_230;

public class Task_226 {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, 3, -15, 60};
        int k = 20;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) < k) {
               count++;
            }
        }
        System.out.println(count);
    }
}
