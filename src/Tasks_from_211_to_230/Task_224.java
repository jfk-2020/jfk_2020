package Tasks_from_211_to_230;

public class Task_224 {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, 3, -20, 60};
        int k = 20;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) < k) {
                sum = (int) (sum + Math.pow(numbers[i], 3));
            }
        }
        System.out.println(sum);
    }
}
