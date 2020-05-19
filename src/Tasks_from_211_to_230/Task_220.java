package Tasks_from_211_to_230;

public class Task_220 {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 5;
        numbers[1] = -6;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 6;
        numbers[5] = -4;
        numbers[6] = -4;
        int count = 0;
        int countAbsolut = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0){
                count++;
            }
        }
        System.out.println("Count of negative items: " + count);
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                countAbsolut++;
            }
        }
        System.out.println("Count of positive items: " + countAbsolut);
        System.out.println("Total count of items: " + (countAbsolut + count));
    }
}
