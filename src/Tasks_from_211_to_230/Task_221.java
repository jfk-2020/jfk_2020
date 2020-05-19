package Tasks_from_211_to_230;

public class Task_221 {
    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        int[] numbers = {a, 5, 6, 8, 12, 15, 18, b};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= a && numbers[i] <= b){
                sum= sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
