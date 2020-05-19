package Tasks_from_211_to_230;

public class Task_222 {
    public static void main(String[] args) {
        int c = 2;
        int d = 20;
        int[] numbers = {c, 5, 6, 8, d};
        int multiple = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= c && numbers[i] < d){
                multiple = multiple * numbers[i];
            }
        }
        System.out.println(multiple);
    }
}
