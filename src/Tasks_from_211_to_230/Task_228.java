package Tasks_from_211_to_230;

public class Task_228 {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, 3, -15, 60};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(i % k == 0){
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
