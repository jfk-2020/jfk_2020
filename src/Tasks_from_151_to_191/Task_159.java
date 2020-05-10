package Tasks_from_151_to_191;

public class Task_159 {
    public static void main(String[] args) {
        double mult = 1;

        for (int i = 100; i < 1000; i ++) {
            if (i % 3 == 1 && i % 4 == 2)
                mult = mult * i; // mult *= i;
        }
        System.out.println(mult);
    }
}
