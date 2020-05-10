package Tasks_from_151_to_191;

public class Task_156 {
    public static void main(String[] args) {
        double mult = 1;

        for (int i = 10; i < 100; i ++) {
            if (i % 3 == 0 && i % 5 == 0)
                mult = mult * i; // sum *= i;
        }
        System.out.println(mult);
    }
}
