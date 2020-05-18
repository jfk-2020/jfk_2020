package Tasks_from_211_to_230;

public class Task_211 {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = -15;
        array[1] = 30;
        array[2] = -30;
        array[3] = 20;
        array[4] = 16;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                count++;
            }
        }
        System.out.println((double) sum / count);
    }
}
