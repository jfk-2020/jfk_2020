package Tasks_from_151_to_191;

public class Task_155 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 10; i < 100; i ++) {
             if (i % 3 == 0)
                 sum = sum + i; // sum += i;
        }
        System.out.println(sum);
    }
}
