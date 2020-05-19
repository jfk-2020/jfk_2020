package Tasks_from_211_to_230;

public class Task_229 {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, 3, -20, 60};
        int multiple = 1;

        for (int i = 0; i < numbers.length; i++) {
            if((numbers[i] - i) > 0) {
                multiple = multiple * numbers[i];
            }
        }
        System.out.println(multiple);
    }
}
