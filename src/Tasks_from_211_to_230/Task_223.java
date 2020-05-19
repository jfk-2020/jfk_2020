package Tasks_from_211_to_230;

public class Task_223 {
    public static void main(String[] args) {
        int a = 2;
        int b = 20;
        int[] numbers = {a, 5, 6, 8, 12, 15, 16, 18, b};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a && numbers[i] < b){
                count++;
            }
        }
        System.out.println(count);
    }
}
